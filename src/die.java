import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class die extends dge {
   public static final MapCodec<die> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dnr.a.fieldOf("wood_type").forGetter(dge::d), u()).apply($$0, die::new));
   public static final dmy b = dda.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ih, epo> i = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         czf.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ih.d,
         czf.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ih.f,
         czf.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ih.e,
         czf.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<die> a() {
      return a;
   }

   public die(dnr $$0, dmd.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ih.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      dme $$1 = this.o();
      ehr $$2 = $$0.q().b_($$0.a());
      cwh $$3 = $$0.q();
      ib $$4 = $$0.a();
      ih[] $$5 = $$0.f();

      for (ih $$6 : $$5) {
         if ($$6.o().d()) {
            ih $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == ehs.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dme $$0) {
      return $$0.c(b).p();
   }

   @Override
   public eov m(dme $$0) {
      epo $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, f);
   }
}
