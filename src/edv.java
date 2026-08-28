import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record edv(List<edv.a> b, ji c, eac d, boolean e) implements eee {
   public static final Codec<edv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edv.a.a.listOf().fieldOf("layers").forGetter(edv::a),
               ji.g.fieldOf("direction").forGetter(edv::b),
               eac.b.fieldOf("allowed_placement").forGetter(edv::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(edv::d)
            )
            .apply($$0, edv::new)
   );

   public static edv.a a(bpv $$0, egf $$1) {
      return new edv.a($$0, $$1);
   }

   public static edv b(bpv $$0, egf $$1) {
      return new edv(List.of(a($$0, $$1)), ji.b, eac.c, false);
   }

   public List<edv.a> a() {
      return this.b;
   }

   public ji b() {
      return this.c;
   }

   public eac c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bpv b, egf c) {
      public static final Codec<edv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bpv.d.fieldOf("height").forGetter(edv.a::a), egf.a.fieldOf("provider").forGetter(edv.a::b)).apply($$0, edv.a::new)
      );

      public bpv a() {
         return this.b;
      }

      public egf b() {
         return this.c;
      }
   }
}
