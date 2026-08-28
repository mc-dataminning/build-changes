import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwb extends duq implements ecm.b<ect.b>, ect {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 10;
   private static final int c = 20;
   private static final int d = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<awu> k = ae.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awv.CG);
      $$0.put(2, awv.CH);
      $$0.put(3, awv.CI);
      $$0.put(4, awv.CF);
   });
   private int l;
   private final ect.d m = new dwb.a();
   private ect.a n = new ect.a();
   private final ect.b r = new ect.b(this);

   public dwb(jh $$0, dxo $$1) {
      super(dus.M, $$0, $$1);
   }

   @Override
   public ect.a gp() {
      return this.n;
   }

   @Override
   public ect.d gq() {
      return this.m;
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      aln<vj> $$2 = $$1.a(va.a);
      if ($$0.b("listener", 10)) {
         ect.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      aln<vj> $$2 = $$1.a(va.a);
      ect.a.a
         .encodeStart($$2, this.n)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static ary a(@Nullable bvb $$0) {
      if ($$0 instanceof ary) {
         return (ary)$$0;
      } else {
         if ($$0 != null) {
            bvx $$6 = $$0.cX();
            if ($$6 instanceof ary) {
               return (ary)$$6;
            }
         }

         if ($$0 instanceof cqh $$3) {
            bvb var3 = $$3.p();
            if (var3 instanceof ary) {
               return (ary)var3;
            }
         }

         if ($$0 instanceof cls $$5) {
            bvb var9 = $$5.p();
            if (var9 instanceof ary) {
               return (ary)var9;
            }
         }

         return null;
      }
   }

   public void a(arx $$0, @Nullable ary $$1) {
      if ($$1 != null) {
         dxo $$2 = this.m();
         if (!$$2.c(drc.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bvb)$$1);
            }
         }
      }
   }

   private boolean b(arx $$0, ary $$1) {
      OptionalInt $$2 = cot.a($$0, this.aB_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(arx $$0, @Nullable bvb $$1) {
      jh $$2 = this.aB_();
      dxo $$3 = this.m();
      $$0.a($$2, $$3.b(drc.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(eck.N, $$2, eck.a.a($$1));
   }

   private boolean b(arx $$0) {
      return this.m().c(drc.d) && $$0.am() != bsx.a && $$0.O().b(dgv.N);
   }

   public void a(arx $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dgz)$$0);
         }

         cor.a($$0, fbr.b(this.aB_()), null, 40);
      }
   }

   private void b(dgz $$0) {
      awu $$1 = (awu)k.get(this.l);
      if ($$1 != null) {
         jh $$2 = this.aB_();
         int $$3 = $$2.u() + azu.b($$0.A, -10, 10);
         int $$4 = $$2.v() + azu.b($$0.A, -10, 10);
         int $$5 = $$2.w() + azu.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, aww.f, 5.0F, 1.0F);
      }
   }

   private boolean c(arx $$0) {
      return this.l < 4 ? false : ban.a(bvi.bG, bvh.k, $$0, this.aB_(), 20, 5, 6, ban.a.b, false).isPresent();
   }

   public ect.b b() {
      return this.r;
   }

   class a implements ect.d {
      private static final int b = 8;
      private final eco c = new ecg(dwb.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public eco b() {
         return this.c;
      }

      @Override
      public aya<eck> c() {
         return axr.c;
      }

      @Override
      public boolean a(arx $$0, jh $$1, jq<eck> $$2, eck.a $$3) {
         return !dwb.this.m().c(drc.b) && dwb.a($$3.a()) != null;
      }

      @Override
      public void a(arx $$0, jh $$1, jq<eck> $$2, @Nullable bvb $$3, @Nullable bvb $$4, float $$5) {
         dwb.this.a($$0, dwb.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dwb.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
