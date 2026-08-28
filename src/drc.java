import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class drc extends dmr implements duc {
   public static final MapCodec<drc> a = b(drc::new);
   public static final ebr<jb> b = dqs.e;
   public static final ebk c = ebj.I;
   public static final Map<jb, ffw> d = fft.c(dmr.c(16.0, 13.0, 16.0));

   @Override
   public MapCodec<drc> a() {
      return a;
   }

   protected drc(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return d.get($$0.c(b));
   }

   private boolean a(diq $$0, iv $$1, jb $$2) {
      eat $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      jb $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dmt.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, exb.c, exb.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      if (!$$0.c()) {
         eat $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      eat $$2 = this.m();
      djp $$3 = $$0.q();
      iv $$4 = $$0.a();
      exa $$5 = $$0.q().b_($$0.a());

      for (jb $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == exb.c));
            }
         }
      }

      return null;
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(c) ? exb.c.a(false) : super.b_($$0);
   }
}
