import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dxz extends dwn implements eeq.b<eex.b>, eex {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 10;
   private static final int c = 20;
   private static final int d = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<awk> k = af.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awl.CP);
      $$0.put(2, awl.CQ);
      $$0.put(3, awl.CR);
      $$0.put(4, awl.CO);
   });
   private int l;
   private final eex.d m = new dxz.a();
   private eex.a q = new eex.a();
   private final eex.b r = new eex.b(this);

   public dxz(iu $$0, dzo $$1) {
      super(dwp.M, $$0, $$1);
   }

   @Override
   public eex.a x() {
      return this.q;
   }

   @Override
   public eex.d gq() {
      return this.m;
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      alc<uu> $$2 = $$1.a(ul.a);
      if ($$0.b("listener", 10)) {
         eex.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      alc<uu> $$2 = $$1.a(ul.a);
      eex.a.a
         .encodeStart($$2, this.q)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static arp a(@Nullable bwa $$0) {
      if ($$0 instanceof arp) {
         return (arp)$$0;
      } else {
         if ($$0 != null) {
            bwz $$6 = $$0.cW();
            if ($$6 instanceof arp) {
               return (arp)$$6;
            }
         }

         if ($$0 instanceof crm $$3) {
            bwa var3 = $$3.q();
            if (var3 instanceof arp) {
               return (arp)var3;
            }
         }

         if ($$0 instanceof cmx $$5) {
            bwa var9 = $$5.q();
            if (var9 instanceof arp) {
               return (arp)var9;
            }
         }

         return null;
      }
   }

   public void a(aro $$0, @Nullable arp $$1) {
      if ($$1 != null) {
         dzo $$2 = this.m();
         if (!$$2.c(dst.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bwa)$$1);
            }
         }
      }
   }

   private boolean b(aro $$0, arp $$1) {
      OptionalInt $$2 = cpx.a($$0, this.aw_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(aro $$0, @Nullable bwa $$1) {
      iu $$2 = this.aw_();
      dzo $$3 = this.m();
      $$0.a($$2, $$3.b(dst.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(eeo.N, $$2, eeo.a.a($$1));
   }

   private boolean b(aro $$0) {
      return this.m().c(dst.d) && $$0.an() != btv.a && $$0.O().c(dil.N);
   }

   @Override
   public void a(iu $$0, dzo $$1) {
      if ($$1.c(dst.b) && this.n instanceof aro $$2) {
         this.a($$2);
      }
   }

   public void a(aro $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dip)$$0);
         }

         cpv.a($$0, fdw.b(this.aw_()), null, 40);
      }
   }

   private void b(dip $$0) {
      awk $$1 = (awk)k.get(this.l);
      if ($$1 != null) {
         iu $$2 = this.aw_();
         int $$3 = $$2.u() + azk.b($$0.A, -10, 10);
         int $$4 = $$2.v() + azk.b($$0.A, -10, 10);
         int $$5 = $$2.w() + azk.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awm.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aro $$0) {
      return this.l < 4 ? false : baf.a(bwj.bG, bwi.k, $$0, this.aw_(), 20, 5, 6, baf.a.b, false).isPresent();
   }

   public eex.b a() {
      return this.r;
   }

   class a implements eex.d {
      private static final int b = 8;
      private final ees c = new eek(dxz.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ees b() {
         return this.c;
      }

      @Override
      public axp<eeo> c() {
         return axg.c;
      }

      @Override
      public boolean a(aro $$0, iu $$1, je<eeo> $$2, eeo.a $$3) {
         return !dxz.this.m().c(dst.b) && dxz.a($$3.a()) != null;
      }

      @Override
      public void a(aro $$0, iu $$1, je<eeo> $$2, @Nullable bwa $$3, @Nullable bwa $$4, float $$5) {
         dxz.this.a($$0, dxz.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dxz.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
