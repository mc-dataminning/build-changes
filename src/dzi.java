import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dzi(alf<eze> d, double e, double f, cyy g, Optional<alf<eze>> h, dyz i, dyz.a j) {
   static final String a = "config";
   static dzi b = new dzi();
   static Codec<dzi> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alf.a(mg.bp).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dzi::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dzi::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dzi::d),
                  cyy.a("key_item").forGetter(dzi::e),
                  alf.a(mg.bp).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dzi::f)
               )
               .apply($$0, dzi::new)
      )
      .validate(dzi::h);

   private dzi() {
      this(eyv.R, 4.0, 4.5, new cyy(czc.zJ), Optional.empty(), dyz.b, dyz.a.a);
   }

   public dzi(alf<eze> $$0, double $$1, double $$2, cyy $$3, Optional<alf<eze>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dyz a() {
      return this.i;
   }

   private DataResult<dzi> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public alf<eze> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cyy e() {
      return this.g;
   }

   public Optional<alf<eze>> f() {
      return this.h;
   }

   public dyz.a g() {
      return this.j;
   }
}
