import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxx extends ddx {
   public static final MapCodec<cxx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dlc.a.fieldOf("wood_type").forGetter(ddx::d), u()).apply($$0, cxx::new));
   public static final dkp b = dkf.ba;
   public static final dkg c = dkf.a;
   protected static final float d = 5.0F;
   protected static final emv e = cwy.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, emv> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         cwy.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         cwy.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         cwy.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         cwy.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<cxx> a() {
      return a;
   }

   public cxx(dlc $$0, djo.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      if ($$2.c_($$3) instanceof dim $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bke.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cfq $$0, ely $$1, dim $$2, cng $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cmt && $$1.b().equals(ic.a);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ic.a, dey.b);
   }

   @Override
   public djp a(cpp $$0) {
      ctx $$1 = $$0.q();
      eez $$2 = $$1.b_($$0.a());
      hx $$3 = $$0.a().c();
      djp $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(asi.az);
      ic $$6 = ic.a((double)$$0.i());
      boolean $$7 = !cwy.a($$4.k($$1, $$3), ic.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dfv.b)) {
            ic $$8 = $$4.c(dfv.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ic> $$9 = dkv.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dkv.a($$6.g()) : dkv.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == efa.c));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      emv $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   public emv b_(djp $$0, ctd $$1, hx $$2) {
      return this.a($$0, $$1, $$2, emh.a());
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1 == ic.b && !this.a($$0, $$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(djp $$0) {
      return dkv.b($$0.c(b));
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dia($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return a($$2, dhf.i, dim::a);
   }
}
