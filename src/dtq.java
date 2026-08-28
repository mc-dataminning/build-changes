import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dtq extends dsg implements eac.b<eaj.b>, eaj {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<awj> k = ad.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awk.BV);
      $$0.put(2, awk.BW);
      $$0.put(3, awk.BX);
      $$0.put(4, awk.BU);
   });
   private int l;
   private final eaj.d m = new dtq.a();
   private eaj.a n = new eaj.a();
   private final eaj.b r = new eaj.b(this);

   public dtq(jg $$0, dvd $$1) {
      super(dsi.L, $$0, $$1);
   }

   @Override
   public eaj.a gx() {
      return this.n;
   }

   @Override
   public eaj.d gy() {
      return this.m;
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      alf<vg> $$2 = $$1.a(ux.a);
      if ($$0.b("listener", 10)) {
         eaj.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> b.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      alf<vg> $$2 = $$1.a(ux.a);
      eaj.a.a
         .encodeStart($$2, this.n)
         .resultOrPartial($$0x -> b.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static arn a(@Nullable btz $$0) {
      if ($$0 instanceof arn) {
         return (arn)$$0;
      } else {
         if ($$0 != null) {
            buv $$6 = $$0.cY();
            if ($$6 instanceof arn) {
               return (arn)$$6;
            }
         }

         if ($$0 instanceof cpb $$3) {
            btz var3 = $$3.s();
            if (var3 instanceof arn) {
               return (arn)var3;
            }
         }

         if ($$0 instanceof ckq $$5) {
            btz var9 = $$5.s();
            if (var9 instanceof arn) {
               return (arn)var9;
            }
         }

         return null;
      }
   }

   public void a(arm $$0, @Nullable arn $$1) {
      if ($$1 != null) {
         dvd $$2 = this.m();
         if (!$$2.c(dos.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (btz)$$1);
            }
         }
      }
   }

   private boolean b(arm $$0, arn $$1) {
      OptionalInt $$2 = cnm.a($$0, this.aC_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(arm $$0, @Nullable btz $$1) {
      jg $$2 = this.aC_();
      dvd $$3 = this.m();
      $$0.a($$2, $$3.b(dos.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(eaa.N, $$2, eaa.a.a($$1));
   }

   private boolean b(arm $$0) {
      return this.m().c(dos.d) && $$0.am() != brv.a && $$0.ac().b(der.M);
   }

   public void a(arm $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dev)$$0);
         }

         cnk.a($$0, ezh.b(this.aC_()), null, 40);
      }
   }

   private void b(dev $$0) {
      awj $$1 = (awj)k.get(this.l);
      if ($$1 != null) {
         jg $$2 = this.aC_();
         int $$3 = $$2.u() + azj.b($$0.A, -10, 10);
         int $$4 = $$2.v() + azj.b($$0.A, -10, 10);
         int $$5 = $$2.w() + azj.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awl.f, 5.0F, 1.0F);
      }
   }

   private boolean c(arm $$0) {
      return this.l < 4 ? false : bac.a(bug.bm, buf.k, $$0, this.aC_(), 20, 5, 6, bac.a.b).isPresent();
   }

   public eaj.b b() {
      return this.r;
   }

   class a implements eaj.d {
      private static final int b = 8;
      private final eae c = new dzw(dtq.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public eae b() {
         return this.c;
      }

      @Override
      public axp<eaa> c() {
         return axg.c;
      }

      @Override
      public boolean a(arm $$0, jg $$1, jp<eaa> $$2, eaa.a $$3) {
         return !dtq.this.m().c(dos.b) && dtq.a($$3.a()) != null;
      }

      @Override
      public void a(arm $$0, jg $$1, jp<eaa> $$2, @Nullable btz $$3, @Nullable btz $$4, float $$5) {
         dtq.this.a($$0, dtq.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dtq.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
