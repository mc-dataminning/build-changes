import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;

public class dqh extends dpn {
   public static final MapCodec<dqh> a = b(dqh::new);
   private static final wy b = wy.c("container.grindstone_title");
   private final Function<eat, ffw> d;

   @Override
   public MapCodec<dqh> a() {
      return a;
   }

   protected dqh(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jb.c).b(c, ebe.b));
      this.d = this.b();
   }

   private Function<eat, ffw> b() {
      ffw $$0 = fft.a(dmr.a(2.0, 6.0, 7.0, 4.0, 10.0, 16.0), dmr.a(2.0, 5.0, 3.0, 4.0, 11.0, 9.0));
      ffw $$1 = fft.a($$0, h.z);
      ffw $$2 = fft.a(dmr.a(8.0, 2.0, 14.0, 0.0, 12.0), $$0, $$1);
      Map<ebe, Map<jb, ffw>> $$3 = fft.e($$2);
      return this.a($$1x -> $$3.get($$1x.c(c)).get($$1x.c(e)));
   }

   private ffw o(eat $$0) {
      return this.d.apply($$0);
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.o($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.o($$0);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return true;
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.aD);
      }

      return bug.a;
   }

   @Override
   protected bui b(eat $$0, djm $$1, iv $$2) {
      return new buo(($$2x, $$3, $$4) -> new cwf($$2x, $$3, cvs.a($$1, $$2)), b);
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
