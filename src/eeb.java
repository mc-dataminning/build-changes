import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eeb(List<eeb.a> b, iw c, eab d, boolean e) implements eek {
   public static final Codec<eeb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eeb.a.a.listOf().fieldOf("layers").forGetter(eeb::a),
               iw.g.fieldOf("direction").forGetter(eeb::b),
               eab.b.fieldOf("allowed_placement").forGetter(eeb::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(eeb::d)
            )
            .apply($$0, eeb::new)
   );

   public static eeb.a a(bpf $$0, egl $$1) {
      return new eeb.a($$0, $$1);
   }

   public static eeb b(bpf $$0, egl $$1) {
      return new eeb(List.of(a($$0, $$1)), iw.b, eab.c, false);
   }

   public List<eeb.a> a() {
      return this.b;
   }

   public iw b() {
      return this.c;
   }

   public eab c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bpf b, egl c) {
      public static final Codec<eeb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bpf.d.fieldOf("height").forGetter(eeb.a::a), egl.a.fieldOf("provider").forGetter(eeb.a::b)).apply($$0, eeb.a::new)
      );

      public bpf a() {
         return this.b;
      }

      public egl b() {
         return this.c;
      }
   }
}
