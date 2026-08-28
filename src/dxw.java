import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dxw(alc<exq> d, double e, double f, cxy g, Optional<alc<exq>> h, dxn i, dxn.a j) {
   static final String a = "config";
   static dxw b = new dxw();
   static Codec<dxw> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alc.a(me.bn).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dxw::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dxw::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dxw::d),
                  cxy.a("key_item").forGetter(dxw::e),
                  alc.a(me.bn).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dxw::f)
               )
               .apply($$0, dxw::new)
      )
      .validate(dxw::h);

   private dxw() {
      this(exh.R, 4.0, 4.5, new cxy(cyc.zH), Optional.empty(), dxn.b, dxn.a.a);
   }

   public dxw(alc<exq> $$0, double $$1, double $$2, cxy $$3, Optional<alc<exq>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dxn a() {
      return this.i;
   }

   private DataResult<dxw> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public alc<exq> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cxy e() {
      return this.g;
   }

   public Optional<alc<exq>> f() {
      return this.h;
   }

   public dxn.a g() {
      return this.j;
   }
}
