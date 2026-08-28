import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dof extends dmf {
   public static final MapCodec<dof> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtu.a.fieldOf("wood_type").forGetter(dmf::d), u()).apply($$0, dof::new));
   public static final dtb b = djb.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jf, ews> i = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         dff.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jf.d,
         dff.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jf.f,
         dff.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jf.e,
         dff.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   public dof(dtu $$0, dsg.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, jf.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = this.o();
      eob $$2 = $$0.q().b_($$0.a());
      dcg $$3 = $$0.q();
      ja $$4 = $$0.a();
      jf[] $$5 = $$0.f();

      for (jf $$6 : $$5) {
         if ($$6.o().d()) {
            jf $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eoc.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsh $$0) {
      return $$0.c(b).p();
   }

   @Override
   public evz m(dsh $$0) {
      ews $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, f);
   }
}
