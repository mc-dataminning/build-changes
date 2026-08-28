import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dhu extends dnw {
   public static final MapCodec<dhu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dvn.a.fieldOf("wood_type").forGetter(dnw::d), u()).apply($$0, dhu::new));
   public static final dva b = duq.ba;
   public static final dur c = duq.a;
   protected static final float d = 5.0F;
   protected static final eyx e = dgv.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, eyx> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dgv.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dgv.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dgv.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dgv.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dhu> a() {
      return a;
   }

   public dhu(dvn $$0, dtz.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.E.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      if ($$2.c_($$3) instanceof dsq $$7 && this.a($$4, $$6, $$7, $$0)) {
         return brk.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cnp $$0, eya $$1, dsq $$2, cvl $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cuy && $$1.b().equals(jj.a);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jj.a, dox.b);
   }

   @Override
   public dua a(cyw $$0) {
      dds $$1 = $$0.q();
      eqb $$2 = $$1.b_($$0.a());
      je $$3 = $$0.a().d();
      dua $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(aws.aB);
      jj $$6 = jj.a((double)$$0.i());
      boolean $$7 = !dgv.a($$4.g($$1, $$3), jj.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dpv.b)) {
            jj $$8 = $$4.c(dpv.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jj> $$9 = dvg.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dvg.a($$6.g()) : dvg.a($$0.i() + 180.0F);
      return this.o().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(f, Boolean.valueOf($$2.a() == eqc.c));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      eyx $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected eyx b_(dua $$0, dcx $$1, je $$2) {
      return this.a($$0, $$1, $$2, eyj.a());
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$1 == jj.b && !this.a($$0, $$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(dua $$0) {
      return dvg.b($$0.c(b));
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dsd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return a($$2, drg.i, dsq::a);
   }
}
