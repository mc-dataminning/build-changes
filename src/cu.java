import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cu extends dj<cu.a> {
   @Override
   public Codec<cu.a> a() {
      return cu.a.a;
   }

   public void a(arr $$0, alf<eze> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bi> b, alf<eze> c) implements dj.a {
      public static final Codec<cu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(cu.a::a), alf.a(mg.bp).fieldOf("loot_table").forGetter(cu.a::b)).apply($$0, cu.a::new)
      );

      public static aq<cu.a> a(alf<eze> $$0) {
         return ap.Q.a(new cu.a(Optional.empty(), $$0));
      }

      public boolean b(alf<eze> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public alf<eze> b() {
         return this.c;
      }
   }
}
