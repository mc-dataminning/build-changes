import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ct extends dh<ct.a> {
   @Override
   public Codec<ct.a> a() {
      return ct.a.a;
   }

   public void a(aqu $$0, aks<eru> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bd> b, aks<eru> c) implements dh.a {
      public static final Codec<ct.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(ct.a::a), aks.a(li.aU).fieldOf("loot_table").forGetter(ct.a::b)).apply($$0, ct.a::new)
      );

      public static ao<ct.a> a(aks<eru> $$0) {
         return an.Q.a(new ct.a(Optional.empty(), $$0));
      }

      public boolean b(aks<eru> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public aks<eru> b() {
         return this.c;
      }
   }
}
