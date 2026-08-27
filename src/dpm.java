import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dpm(List<dpm.a> b, hc c, dlu d, boolean e) implements dpv {
   public static final Codec<dpm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpm.a.a.listOf().fieldOf("layers").forGetter(dpm::a),
               hc.g.fieldOf("direction").forGetter(dpm::b),
               dlu.b.fieldOf("allowed_placement").forGetter(dpm::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dpm::d)
            )
            .apply($$0, dpm::new)
   );

   public static dpm.a a(bfy $$0, drw $$1) {
      return new dpm.a($$0, $$1);
   }

   public static dpm b(bfy $$0, drw $$1) {
      return new dpm(List.of(a($$0, $$1)), hc.b, dlu.c, false);
   }

   public List<dpm.a> a() {
      return this.b;
   }

   public hc b() {
      return this.c;
   }

   public dlu c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bfy b, drw c) {
      public static final Codec<dpm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bfy.d.fieldOf("height").forGetter(dpm.a::a), drw.a.fieldOf("provider").forGetter(dpm.a::b)).apply($$0, dpm.a::new)
      );

      public bfy a() {
         return this.b;
      }

      public drw b() {
         return this.c;
      }
   }
}
