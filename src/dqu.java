import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;

public class dqu extends dqa {
   public static final MapCodec<dqu> a = b(dqu::new);
   private static final xc b = xc.c("container.grindstone_title");
   private final Function<ebg, fgm> d;

   @Override
   public MapCodec<dqu> a() {
      return a;
   }

   protected dqu(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jc.c).b(c, ebr.b));
      this.d = this.b();
   }

   private Function<ebg, fgm> b() {
      fgm $$0 = fgj.a(dne.a(2.0, 6.0, 7.0, 4.0, 10.0, 16.0), dne.a(2.0, 5.0, 3.0, 4.0, 11.0, 9.0));
      fgm $$1 = fgj.a($$0, h.z);
      fgm $$2 = fgj.a(dne.a(8.0, 2.0, 14.0, 0.0, 12.0), $$0, $$1);
      Map<ebr, Map<jc, fgm>> $$3 = fgj.e($$2);
      return this.a($$1x -> $$3.get($$1x.c(c)).get($$1x.c(e)));
   }

   private fgm o(ebg $$0) {
      return this.d.apply($$0);
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.o($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.o($$0);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return true;
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(axb.aD);
      }

      return but.a;
   }

   @Override
   protected buv b(ebg $$0, djz $$1, iw $$2) {
      return new bvb(($$2x, $$3, $$4) -> new cws($$2x, $$3, cwf.a($$1, $$2)), b);
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
