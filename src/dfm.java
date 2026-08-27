import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dfm extends ddo {
   public static final MapCodec<dfm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkt.a.fieldOf("wood_type").forGetter(ddo::d), u()).apply($$0, dfm::new));
   public static final dka b = dak.aE;
   public static final eml c = cwp.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final eml d = cwp.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final eml e = emi.a(c, cwp.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final eml i = emi.a(d, cwp.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ic, eml> j = Maps.newEnumMap(ImmutableMap.of(ic.c, e, ic.d, e, ic.f, i, ic.e, i));

   @Override
   public MapCodec<dfm> a() {
      return a;
   }

   public dfm(dkt $$0, djf.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ic.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.c_($$2) instanceof did $$6) {
         cmx $$7 = $$3.b($$4);
         if (this.a($$0, $$3, $$5, $$6, $$7)) {
            return bka.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(djg $$0, cfh $$1, elo $$2, did $$3, cmx $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cmj && !this.a($$2, $$0);
   }

   private boolean a(elo $$0, djg $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return j.get($$0.c(b));
   }

   @Override
   public eml b_(djg $$0, csu $$1, hx $$2) {
      return this.a($$0, $$1, $$2, elx.a());
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      switch ((ic)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(djg $$0, ctr $$1, hx $$2) {
      ic $$3 = $$0.c(b).h();
      ic $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(ctr $$0, djg $$1, hx $$2, ic $$3) {
      djg $$4 = $$0.a_($$2);
      return $$4.a(asg.ay) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dep.a);
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      djg $$1 = this.o();
      eeq $$2 = $$0.q().b_($$0.a());
      ctr $$3 = $$0.q();
      hx $$4 = $$0.a();

      for (ic $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ic $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eer.c));
            }
         }
      }

      return null;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(djg $$0) {
      return $$0.c(b).p();
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dhr($$0, $$1);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return a($$2, dgw.i, did::a);
   }
}
