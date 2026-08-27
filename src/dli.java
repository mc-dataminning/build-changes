import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dli extends dkq {
   public static final MapCodec<dli> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dli::new));
   public static final dqc g = dgc.aE;
   protected static final float h = 2.5F;
   private static final Map<ij, etc> i = Maps.newEnumMap(
      ImmutableMap.of(
         ij.c,
         dch.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         ij.d,
         dch.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         ij.e,
         dch.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         ij.f,
         dch.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dli> a() {
      return f;
   }

   protected dli(kq $$0, dph.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, ij.c));
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return m($$0);
   }

   public static etc m(dpi $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(czj $$0, id $$1, ij $$2) {
      id $$3 = $$1.a($$2.g());
      dpi $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      dpi $$1 = this.n();
      czj $$2 = $$0.q();
      id $$3 = $$0.a();
      ij[] $$4 = $$0.f();

      for (ij $$5 : $$4) {
         if ($$5.o().d()) {
            ij $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dcj.a.n() : $$0;
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      ij $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      ij $$10 = $$4.g();
      $$1.a(kn.ac, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(g);
   }
}
