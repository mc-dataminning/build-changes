import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dhj extends dgd implements dnb.b<dni.b>, dni {
   private static final Logger b = LogUtils.getLogger();
   private dni.a c;
   private final dni.b d;
   private final dni.d e = this.c();
   private int g;

   protected dhj(dgf<?> $$0, hv $$1, dip $$2) {
      super($$0, $$1, $$2);
      this.c = new dni.a();
      this.d = new dni.b(this);
   }

   public dhj(hv $$0, dip $$1) {
      this(dgf.I, $$0, $$1);
   }

   public dni.d c() {
      return new dhj.a(this.aB_());
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.g = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dni.a.a.parse(new Dynamic(sx.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.g);
      dni.a.a.encodeStart(sx.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public dni.a gg() {
      return this.c;
   }

   @Override
   public dni.d gh() {
      return this.e;
   }

   public int f() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public dni.b g() {
      return this.d;
   }

   protected class a implements dni.d {
      public static final int b = 8;
      protected final hv c;
      private final dnd a;

      public a(hv $$1) {
         this.c = $$1;
         this.a = new dmv($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dnd b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(amp $$0, hv $$1, dmz $$2, @Nullable dmz.a $$3) {
         return !$$1.equals(this.c) || $$2 != dmz.f && $$2 != dmz.i ? dcr.n(dhj.this.r()) : false;
      }

      @Override
      public void a(amp $$0, hv $$1, dmz $$2, @Nullable blf $$3, @Nullable blf $$4, float $$5) {
         dip $$6 = dhj.this.r();
         if (dcr.n($$6)) {
            dhj.this.a(dni.a_($$2));
            int $$7 = dni.a_($$5, this.a());
            if ($$6.b() instanceof dcr $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dhj.this.f());
            }
         }
      }

      @Override
      public void e() {
         dhj.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
