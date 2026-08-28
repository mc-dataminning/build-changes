import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dre extends dmq {
   public static final MapCodec<dre> a = b(dre::new);
   public static final ece<jc> b = ebw.S;
   public static final ebx c = ebw.i;
   private final Function<ebg, fgm> d;
   private final Map<jc, fgm> e;

   @Override
   public MapCodec<dre> a() {
      return a;
   }

   public dre(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.a).b(c, Boolean.valueOf(true)));
      fgm $$1 = dne.b(12.0, 11.0, 16.0);
      this.d = this.b($$1);
      this.e = ImmutableMap.builderWithExpectedSize(5).putAll(fgj.c(fgj.a($$1, dne.a(4.0, 8.0, 10.0, 0.0, 4.0)))).put(jc.a, $$1).build();
   }

   private Function<ebg, fgm> b(fgm $$0) {
      fgm $$1 = fgj.a(dne.b(16.0, 10.0, 16.0), dne.b(8.0, 4.0, 10.0));
      fgm $$2 = fgj.a($$1, $$0, ffw.e);
      Map<jc, fgm> $$3 = fgj.d(dne.a(4.0, 4.0, 8.0, 0.0, 8.0), new ffs(8.0, 6.0, 8.0).c(0.0625));
      return this.a($$2x -> fgj.a($$2, fgj.a($$3.get($$2x.c(b)), fgj.b(), ffw.i)), new ecj[]{c});
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2) {
      return this.e.get($$0.c(b));
   }

   @Override
   public ebg a(ddt $$0) {
      jc $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jc.a.b ? jc.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return $$0.C ? null : a($$2, dyg.s, dzh::a);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dzh $$5) {
         $$3.a($$5);
         $$3.a(axb.ad);
      }

      return but.a;
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(djz $$0, iw $$1, ebg $$2) {
      boolean $$3 = !$$0.D($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      bup.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return cvs.a($$1.c_($$2));
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      dye $$5 = $$1.c_($$2);
      if ($$5 instanceof dzh) {
         dzh.a($$1, $$2, $$0, $$3, (dzh)$$5);
      }
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
