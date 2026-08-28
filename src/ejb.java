import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejb implements eit {
   public static final Codec<ejb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(ejb.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ejb::new)
   );
   public final List<ejb.a> b;
   public final int c;
   public final float d;

   public ejb(List<ejb.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public ejb(List<ejb.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public ejb(erz $$0, dxo $$1, int $$2, float $$3) {
      this(ImmutableList.of(new ejb.a($$0, $$1)), $$2, $$3);
   }

   public ejb(erz $$0, dxo $$1, int $$2) {
      this(ImmutableList.of(new ejb.a($$0, $$1)), $$2, 0.0F);
   }

   public static ejb.a a(erz $$0, dxo $$1) {
      return new ejb.a($$0, $$1);
   }

   public static class a {
      public static final Codec<ejb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(erz.c.fieldOf("target").forGetter($$0x -> $$0x.b), dxo.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, ejb.a::new)
      );
      public final erz b;
      public final dxo c;

      a(erz $$0, dxo $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
