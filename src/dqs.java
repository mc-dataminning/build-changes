import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;

public class dqs extends dpy {
   public static final MapCodec<dqs> a = b(dqs::new);
   private static final xa b = xa.c("container.grindstone_title");
   private final Function<ebe, fgk> d;

   @Override
   public MapCodec<dqs> a() {
      return a;
   }

   protected dqs(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jb.c).b(c, ebp.b));
      this.d = this.b();
   }

   private Function<ebe, fgk> b() {
      fgk $$0 = fgh.a(dnc.a(2.0, 6.0, 7.0, 4.0, 10.0, 16.0), dnc.a(2.0, 5.0, 3.0, 4.0, 11.0, 9.0));
      fgk $$1 = fgh.a($$0, h.z);
      fgk $$2 = fgh.a(dnc.a(8.0, 2.0, 14.0, 0.0, 12.0), $$0, $$1);
      Map<ebp, Map<jb, fgk>> $$3 = fgh.e($$2);
      return this.a($$1x -> $$3.get($$1x.c(c)).get($$1x.c(e)));
   }

   private fgk o(ebe $$0) {
      return this.d.apply($$0);
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.o($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.o($$0);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return true;
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awz.aD);
      }

      return bur.a;
   }

   @Override
   protected but b(ebe $$0, djx $$1, iv $$2) {
      return new buz(($$2x, $$3, $$4) -> new cwq($$2x, $$3, cwd.a($$1, $$2)), b);
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
