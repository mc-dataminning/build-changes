import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class diy extends dgz {
   public static final MapCodec<diy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dom.a.fieldOf("wood_type").forGetter(dgz::d), u()).apply($$0, diy::new));
   public static final dnt b = ddv.aE;
   public static final eqk c = daa.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final eqk d = daa.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final eqk e = eqh.a(c, daa.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final eqk i = eqh.a(d, daa.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ih, eqk> j = Maps.newEnumMap(ImmutableMap.of(ih.c, e, ih.d, e, ih.f, i, ih.e, i));

   @Override
   public MapCodec<diy> a() {
      return a;
   }

   public diy(dom $$0, dmy.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ih.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      if ($$2.c_($$3) instanceof dlp $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bne.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dmz $$0, cis $$1, epn $$2, dlp $$3, cqk $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cpx && !this.a($$2, $$0);
   }

   private boolean a(epn $$0, dmz $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected eqk b_(dmz $$0, cwf $$1, ib $$2) {
      return this.a($$0, $$1, $$2, epw.a());
   }

   @Override
   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      switch ((ih)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dmz $$0, cxc $$1, ib $$2) {
      ih $$3 = $$0.c(b).h();
      ih $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(cxc $$0, dmz $$1, ib $$2, ih $$3) {
      dmz $$4 = $$0.a_($$2);
      return $$4.a(aun.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dia.a);
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      dmz $$1 = this.o();
      ein $$2 = $$0.q().b_($$0.a());
      cxc $$3 = $$0.q();
      ib $$4 = $$0.a();

      for (ih $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ih $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eio.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dmz $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dld($$0, $$1);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return a($$2, dki.i, dlp::a);
   }
}
