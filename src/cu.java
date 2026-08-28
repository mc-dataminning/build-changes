import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cu extends dj<cu.a> {
   @Override
   public Codec<cu.a> a() {
      return cu.a.a;
   }

   public void a(arp $$0, ald<eys> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bi> b, ald<eys> c) implements dj.a {
      public static final Codec<cu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(cu.a::a), ald.a(mg.bo).fieldOf("loot_table").forGetter(cu.a::b)).apply($$0, cu.a::new)
      );

      public static aq<cu.a> a(ald<eys> $$0) {
         return ap.Q.a(new cu.a(Optional.empty(), $$0));
      }

      public boolean b(ald<eys> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public ald<eys> b() {
         return this.c;
      }
   }
}
