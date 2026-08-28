import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dvg extends dun {
   public static final MapCodec<dvg> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dvg::new));
   public static final eam<ja> e = dpt.e;
   private static final Map<ja, feq> f = fen.c(dlu.a(5.0, 3.0, 13.0, 11.0, 16.0));

   @Override
   public MapCodec<dvg> a() {
      return d;
   }

   protected dvg(mb $$0, dzn.d $$1) {
      super($$0, $$1);
      this.l(this.B.b().b(e, ja.c));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return o($$0);
   }

   public static feq o(dzo $$0) {
      return f.get($$0.c(e));
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return b($$1, $$2, $$0.c(e));
   }

   public static boolean b(dis $$0, iu $$1, ja $$2) {
      iu $$3 = $$1.a($$2.g());
      dzo $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = this.m();
      dis $$2 = $$0.q();
      iu $$3 = $$0.a();
      ja[] $$4 = $$0.f();

      for (ja $$5 : $$4) {
         if ($$5.o().d()) {
            ja $$6 = $$5.g();
            $$1 = $$1.b(e, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4.g() == $$0.c(e) && !$$0.a($$1, $$3) ? dlw.a.m() : $$0;
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      ja $$4 = $$0.c(e);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      ja $$10 = $$4.g();
      $$1.a(lx.ah, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.c, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(e);
   }
}
