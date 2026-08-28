import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dod extends dum {
   public static final MapCodec<dod> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ecs.a.fieldOf("wood_type").forGetter(dum::d), t()).apply($$0, dod::new));
   public static final ece b = ebu.bd;
   public static final ebv c = ebu.a;
   private static final fgk e = dnc.b(10.0, 0.0, 16.0);
   private static final Map<Integer, fgk> f = fgh.c(dnc.a(14.0, 2.0, 0.0, 10.0))
      .entrySet()
      .stream()
      .collect(Collectors.toMap($$0 -> eck.a($$0.getKey()), Entry::getValue));

   @Override
   public MapCodec<dod> a() {
      return a;
   }

   public dod(ecs $$0, ebd.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      if ($$2.c_($$3) instanceof dzq $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bur.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(crx $$0, ffm $$1, dzq $$2, czy $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof czn && $$1.c().equals(jb.a);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jb.a, dvn.b);
   }

   @Override
   public ebe a(ddr $$0) {
      djx $$1 = $$0.q();
      exo $$2 = $$1.b_($$0.a());
      iv $$3 = $$0.a().d();
      ebe $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(axe.aD);
      jb $$6 = jb.a((double)$$0.i());
      boolean $$7 = !dnc.a($$4.g($$1, $$3), jb.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dws.b)) {
            jb $$8 = $$4.c(dws.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jb> $$9 = eck.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? eck.a($$6.g()) : eck.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(d, Boolean.valueOf($$2.a() == exp.c));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return f.getOrDefault($$0.c(b), e);
   }

   @Override
   protected fgk b_(ebe $$0, djb $$1, iv $$2) {
      return this.a($$0, $$1, $$2, ffv.a());
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4 == jb.b && !this.a($$0, $$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(ebe $$0) {
      return eck.b($$0.c(b));
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return a($$2, dye.i, dzq::a);
   }
}
