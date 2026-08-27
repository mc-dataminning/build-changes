import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dlo(ajc d, double e, double f, cpq g, Optional<ajc> h, dlg i, dlg.a j) {
   static final String a = "config";
   static dlo b = new dlo();
   static Codec<dlo> c = avu.a(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ajc.a.optionalFieldOf("loot_table", b.b()).forGetter(dlo::b),
                  Codec.DOUBLE.optionalFieldOf("activation_range", b.c()).forGetter(dlo::c),
                  Codec.DOUBLE.optionalFieldOf("deactivation_range", b.d()).forGetter(dlo::d),
                  cpq.a.optionalFieldOf("key_item", b.e()).forGetter(dlo::e),
                  ajc.a.optionalFieldOf("override_loot_table_to_display").forGetter(dlo::f)
               )
               .apply($$0, dlo::new)
      ),
      dlo::h
   );

   private dlo() {
      this(ejw.S, 4.0, 4.5, new cpq(cpt.yo), Optional.empty(), dlg.b, dlg.a.a);
   }

   public dlo(ajc $$0, double $$1, double $$2, cpq $$3, Optional<ajc> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dlg a() {
      return this.i;
   }

   private DataResult<dlo> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public ajc b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cpq e() {
      return this.g;
   }

   public Optional<ajc> f() {
      return this.h;
   }

   public dlg.a g() {
      return this.j;
   }
}
