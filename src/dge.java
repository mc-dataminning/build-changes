import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dge extends dmf {
   public static final MapCodec<dge> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtu.a.fieldOf("wood_type").forGetter(dmf::d), u()).apply($$0, dge::new));
   public static final dth b = dsx.ba;
   public static final dsy c = dsx.a;
   protected static final float d = 5.0F;
   protected static final ews e = dff.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, ews> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dff.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dff.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dff.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dff.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dge> a() {
      return a;
   }

   public dge(dtu $$0, dsg.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      if ($$2.c_($$3) instanceof dqx $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bqf.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cmh $$0, evv $$1, dqx $$2, cua $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.g() instanceof ctn && $$1.b().equals(jf.a);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), jf.a, dng.b);
   }

   @Override
   public dsh a(cxk $$0) {
      dcd $$1 = $$0.q();
      eob $$2 = $$1.b_($$0.a());
      ja $$3 = $$0.a().c();
      dsh $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(avu.aA);
      jf $$6 = jf.a((double)$$0.i());
      boolean $$7 = !dff.a($$4.k($$1, $$3), jf.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(doe.b)) {
            jf $$8 = $$4.c(doe.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jf> $$9 = dtn.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dtn.a($$6.g()) : dtn.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == eoc.c));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      ews $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected ews b_(dsh $$0, dbj $$1, ja $$2) {
      return this.a($$0, $$1, $$2, ewe.a());
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1 == jf.b && !this.a($$0, $$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsh $$0) {
      return dtn.b($$0.c(b));
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return a($$2, dpp.i, dqx::a);
   }
}
