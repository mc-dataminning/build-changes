import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dxa(akt<ewt> d, double e, double f, cxh g, Optional<akt<ewt>> h, dwr i, dwr.a j) {
   static final String a = "config";
   static dxa b = new dxa();
   static Codec<dxa> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akt.a(mc.bi).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dxa::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dxa::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dxa::d),
                  cxh.a("key_item").forGetter(dxa::e),
                  akt.a(mc.bi).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dxa::f)
               )
               .apply($$0, dxa::new)
      )
      .validate(dxa::h);

   private dxa() {
      this(ewk.R, 4.0, 4.5, new cxh(cxl.zF), Optional.empty(), dwr.b, dwr.a.a);
   }

   public dxa(akt<ewt> $$0, double $$1, double $$2, cxh $$3, Optional<akt<ewt>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dwr a() {
      return this.i;
   }

   private DataResult<dxa> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public akt<ewt> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cxh e() {
      return this.g;
   }

   public Optional<akt<ewt>> f() {
      return this.h;
   }

   public dwr.a g() {
      return this.j;
   }
}
