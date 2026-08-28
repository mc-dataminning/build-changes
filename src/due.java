import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class due extends dtm {
   public static final MapCodec<due> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, due::new));
   public static final dzk<jo> e = dot.e;
   private static final Map<jo, fdo> f = fdl.c(dku.a(5.0, 3.0, 13.0, 11.0, 16.0));

   @Override
   public MapCodec<due> a() {
      return d;
   }

   protected due(lz $$0, dyl.d $$1) {
      super($$0, $$1);
      this.l(this.B.b().b(e, jo.c));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return o($$0);
   }

   public static fdo o(dym $$0) {
      return f.get($$0.c(e));
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return b($$1, $$2, $$0.c(e));
   }

   public static boolean b(dhs $$0, jj $$1, jo $$2) {
      jj $$3 = $$1.a($$2.g());
      dym $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dym $$1 = this.m();
      dhs $$2 = $$0.q();
      jj $$3 = $$0.a();
      jo[] $$4 = $$0.f();

      for (jo $$5 : $$4) {
         if ($$5.o().d()) {
            jo $$6 = $$5.g();
            $$1 = $$1.b(e, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4.g() == $$0.c(e) && !$$0.a($$1, $$3) ? dkw.a.m() : $$0;
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      jo $$4 = $$0.c(e);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      jo $$10 = $$4.g();
      $$1.a(lv.ah, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.c, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(e);
   }
}
