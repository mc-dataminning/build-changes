import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dvn extends dti {
   public static final MapCodec<dvn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ebn.a.fieldOf("wood_type").forGetter(dti::d), t()).apply($$0, dvn::new));
   public static final eax<ja> b = dqa.e;
   private static final Map<ja.a, ffc> c = fez.a(dma.a(16.0, 4.0, 14.0, 16.0));
   private static final Map<ja.a, ffc> e = fez.a(fez.a(c.get(ja.a.c), dma.a(14.0, 2.0, 0.0, 10.0)));

   @Override
   public MapCodec<dvn> a() {
      return a;
   }

   public dvn(ebn $$0, dzy.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.B.b().b(b, ja.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      if ($$2.c_($$3) instanceof dyl $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bub.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dzz $$0, cqy $$1, fee $$2, dyl $$3, cyy $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cyn && !this.a($$2, $$0);
   }

   private boolean a(fee $$0, dzz $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return e.get($$0.c(b).o());
   }

   @Override
   protected ffc b_(dzz $$0, dib $$1, iu $$2) {
      return this.a($$0, $$1, $$2, fen.a());
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return c.get($$0.c(b).o());
   }

   public boolean b(dzz $$0, diy $$1, iu $$2) {
      ja $$3 = $$0.c(b).h();
      ja $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(diy $$0, dzz $$1, iu $$2, ja $$3) {
      dzz $$4 = $$0.a_($$2);
      return $$4.a(axc.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, duj.a);
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = this.m();
      ewg $$2 = $$0.q().b_($$0.a());
      diy $$3 = $$0.q();
      iu $$4 = $$0.a();

      for (ja $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ja $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == ewh.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dzz $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, d);
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dxy($$0, $$1);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return a($$2, dwz.i, dyl::a);
   }
}
