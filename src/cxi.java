import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxi extends ddi {
   public static final MapCodec<cxi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkn.a.fieldOf("wood_type").forGetter(ddi::d), u()).apply($$0, cxi::new));
   public static final dka b = djq.ba;
   public static final djr c = djq.a;
   protected static final float d = 5.0F;
   protected static final emf e = cwj.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, emf> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         cwj.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         cwj.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         cwj.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         cwj.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<cxi> a() {
      return a;
   }

   public cxi(dkn $$0, diz.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.c_($$2) instanceof dhx $$6) {
         cmr $$7 = $$3.b($$4);
         if (this.a($$3, $$5, $$6, $$7)) {
            return bjv.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cfb $$0, eli $$1, dhx $$2, cmr $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cmd && $$1.b().equals(ic.a);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ic.a, dej.b);
   }

   @Override
   public dja a(cpa $$0) {
      cti $$1 = $$0.q();
      eek $$2 = $$1.b_($$0.a());
      hx $$3 = $$0.a().c();
      dja $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(asb.az);
      ic $$6 = ic.a((double)$$0.i());
      boolean $$7 = !cwj.a($$4.k($$1, $$3), ic.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dfg.b)) {
            ic $$8 = $$4.c(dfg.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ic> $$9 = dkg.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dkg.a($$6.g()) : dkg.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == eel.c));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      emf $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   public emf b_(dja $$0, cso $$1, hx $$2) {
      return this.a($$0, $$1, $$2, elr.a());
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$1 == ic.b && !this.a($$0, $$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dja $$0) {
      return dkg.b($$0.c(b));
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dhl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return a($$2, dgq.i, dhx::a);
   }
}
