import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dhs extends dhb {
   public static final MapCodec<dhs> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dhs::new));
   public static final dmd g = dcn.aE;
   protected static final float h = 2.5F;
   private static final Map<ie, eos> i = Maps.newEnumMap(
      ImmutableMap.of(
         ie.c,
         cys.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         ie.d,
         cys.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         ie.e,
         cys.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         ie.f,
         cys.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dhs> a() {
      return f;
   }

   protected dhs(kc $$0, dli.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, ie.c));
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return m($$0);
   }

   public static eos m(dlj $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(cvu $$0, hz $$1, ie $$2) {
      hz $$3 = $$1.a($$2.g());
      dlj $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      dlj $$1 = this.o();
      cvu $$2 = $$0.q();
      hz $$3 = $$0.a();
      ie[] $$4 = $$0.f();

      for (ie $$5 : $$4) {
         if ($$5.o().d()) {
            ie $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? cyu.a.o() : $$0;
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      ie $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      ie $$10 = $$4.g();
      $$1.a(jz.ab, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(g);
   }
}
