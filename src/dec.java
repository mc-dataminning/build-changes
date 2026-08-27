import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dec extends dce {
   public static final MapCodec<dec> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dja.a.fieldOf("wood_type").forGetter(dce::d), u()).apply($$0, dec::new));
   public static final dih b = cza.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ib, eks> i = Maps.newEnumMap(
      ImmutableMap.of(
         ib.c,
         cvf.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ib.d,
         cvf.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ib.f,
         cvf.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ib.e,
         cvf.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   public dec(dja $$0, dhm.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ib.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = this.o();
      ecx $$2 = $$0.q().b_($$0.a());
      csi $$3 = $$0.q();
      hx $$4 = $$0.a();
      ib[] $$5 = $$0.f();

      for (ib $$6 : $$5) {
         if ($$6.o().d()) {
            ib $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == ecy.c));
            }
         }
      }

      return null;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dhn $$0) {
      return $$0.c(b).p();
   }

   @Override
   public ejz h(dhn $$0) {
      eks $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, f);
   }
}
