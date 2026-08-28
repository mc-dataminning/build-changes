import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record edz(List<edz.a> b, ji c, eaf d, boolean e) implements eei {
   public static final Codec<edz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edz.a.a.listOf().fieldOf("layers").forGetter(edz::a),
               ji.g.fieldOf("direction").forGetter(edz::b),
               eaf.b.fieldOf("allowed_placement").forGetter(edz::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(edz::d)
            )
            .apply($$0, edz::new)
   );

   public static edz.a a(bpw $$0, egj $$1) {
      return new edz.a($$0, $$1);
   }

   public static edz b(bpw $$0, egj $$1) {
      return new edz(List.of(a($$0, $$1)), ji.b, eaf.c, false);
   }

   public List<edz.a> a() {
      return this.b;
   }

   public ji b() {
      return this.c;
   }

   public eaf c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bpw b, egj c) {
      public static final Codec<edz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bpw.d.fieldOf("height").forGetter(edz.a::a), egj.a.fieldOf("provider").forGetter(edz.a::b)).apply($$0, edz.a::new)
      );

      public bpw a() {
         return this.b;
      }

      public egj b() {
         return this.c;
      }
   }
}
