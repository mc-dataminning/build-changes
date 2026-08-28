import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class fak implements fam {
   private static final String d = "block_entity";
   private static final fak.a e = new fak.a() {
      @Override
      public vu a(ewp $$0) {
         dux $$1 = $$0.c(ezj.h);
         return $$1 != null ? $$1.b($$1.i().K_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<bbn<?>> b() {
         return Set.of(ezj.h);
      }
   };
   public static final fak a = new fak(e);
   private static final Codec<fak.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ewp.b $$1 = ewp.b.a($$0);
         return b($$1);
      }
   }, fak.a::a);
   public static final MapCodec<fak> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, fak::new));
   public static final Codec<fak> c = f.xmap(fak::new, $$0 -> $$0.g);
   private final fak.a g;

   private static fak.a b(final ewp.b $$0) {
      return new fak.a() {
         @Nullable
         @Override
         public vu a(ewp $$0x) {
            bvk $$1 = $$0.c($$0.a());
            return $$1 != null ? dm.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<bbn<?>> b() {
            return Set.of($$0.a());
         }
      };
   }

   private fak(fak.a $$0) {
      this.g = $$0;
   }

   @Override
   public fal a() {
      return fan.c;
   }

   @Nullable
   @Override
   public vu a(ewp $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<bbn<?>> b() {
      return this.g.b();
   }

   public static fam a(ewp.b $$0) {
      return new fak(b($$0));
   }

   interface a {
      @Nullable
      vu a(ewp var1);

      String a();

      Set<bbn<?>> b();
   }
}
