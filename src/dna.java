import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dna extends dti {
   public static final MapCodec<dna> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ebn.a.fieldOf("wood_type").forGetter(dti::d), t()).apply($$0, dna::new));
   public static final eaz b = eap.bd;
   public static final eaq c = eap.a;
   private static final ffc e = dma.b(10.0, 0.0, 16.0);
   private static final Map<Integer, ffc> f = fez.c(dma.a(14.0, 2.0, 0.0, 10.0))
      .entrySet()
      .stream()
      .collect(Collectors.toMap($$0 -> ebf.a($$0.getKey()), Entry::getValue));

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   public dna(ebn $$0, dzy.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      if ($$2.c_($$3) instanceof dyl $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bub.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cqy $$0, fee $$1, dyl $$2, cyy $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cyn && $$1.c().equals(ja.a);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), ja.a, duj.b);
   }

   @Override
   public dzz a(dcr $$0) {
      div $$1 = $$0.q();
      ewg $$2 = $$1.b_($$0.a());
      iu $$3 = $$0.a().d();
      dzz $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(axc.aD);
      ja $$6 = ja.a((double)$$0.i());
      boolean $$7 = !dma.a($$4.g($$1, $$3), ja.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dvn.b)) {
            ja $$8 = $$4.c(dvn.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ja> $$9 = ebf.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? ebf.a($$6.g()) : ebf.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(d, Boolean.valueOf($$2.a() == ewh.c));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return f.getOrDefault($$0.c(b), e);
   }

   @Override
   protected ffc b_(dzz $$0, dib $$1, iu $$2) {
      return this.a($$0, $$1, $$2, fen.a());
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4 == ja.b && !this.a($$0, $$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dzz $$0) {
      return ebf.b($$0.c(b));
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dxy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return a($$2, dwz.i, dyl::a);
   }
}
