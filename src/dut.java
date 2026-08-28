import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dut(alh<euh> d, double e, double f, cwb g, Optional<alh<euh>> h, duk i, duk.a j) {
   static final String a = "config";
   static dut b = new dut();
   static Codec<dut> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alh.a(lz.bd).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dut::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dut::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dut::d),
                  cwb.a("key_item").forGetter(dut::e),
                  alh.a(lz.bd).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dut::f)
               )
               .apply($$0, dut::new)
      )
      .validate(dut::h);

   private dut() {
      this(ety.R, 4.0, 4.5, new cwb(cwf.yF), Optional.empty(), duk.b, duk.a.a);
   }

   public dut(alh<euh> $$0, double $$1, double $$2, cwb $$3, Optional<alh<euh>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public duk a() {
      return this.i;
   }

   private DataResult<dut> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public alh<euh> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cwb e() {
      return this.g;
   }

   public Optional<alh<euh>> f() {
      return this.h;
   }

   public duk.a g() {
      return this.j;
   }
}
