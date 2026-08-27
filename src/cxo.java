import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxo extends ddo {
   public static final MapCodec<cxo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkt.a.fieldOf("wood_type").forGetter(ddo::d), u()).apply($$0, cxo::new));
   public static final dkg b = djw.ba;
   public static final djx c = djw.a;
   protected static final float d = 5.0F;
   protected static final eml e = cwp.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, eml> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         cwp.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         cwp.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         cwp.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         cwp.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<cxo> a() {
      return a;
   }

   public cxo(dkt $$0, djf.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.c_($$2) instanceof did $$6) {
         cmx $$7 = $$3.b($$4);
         if (this.a($$3, $$5, $$6, $$7)) {
            return bka.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cfh $$0, elo $$1, did $$2, cmx $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cmj && $$1.b().equals(ic.a);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ic.a, dep.b);
   }

   @Override
   public djg a(cpg $$0) {
      cto $$1 = $$0.q();
      eeq $$2 = $$1.b_($$0.a());
      hx $$3 = $$0.a().c();
      djg $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(asg.az);
      ic $$6 = ic.a((double)$$0.i());
      boolean $$7 = !cwp.a($$4.k($$1, $$3), ic.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dfm.b)) {
            ic $$8 = $$4.c(dfm.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ic> $$9 = dkm.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dkm.a($$6.g()) : dkm.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == eer.c));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      eml $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   public eml b_(djg $$0, csu $$1, hx $$2) {
      return this.a($$0, $$1, $$2, elx.a());
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return $$1 == ic.b && !this.a($$0, $$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(djg $$0) {
      return dkm.b($$0.c(b));
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dhr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return a($$2, dgw.i, did::a);
   }
}
