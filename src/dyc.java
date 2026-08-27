import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dyc implements dxu {
   public static final Codec<dyc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dyc.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dyc::new)
   );
   public final List<dyc.a> b;
   public final int c;
   public final float d;

   public dyc(List<dyc.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dyc(List<dyc.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dyc(egw $$0, dmz $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dyc.a($$0, $$1)), $$2, $$3);
   }

   public dyc(egw $$0, dmz $$1, int $$2) {
      this(ImmutableList.of(new dyc.a($$0, $$1)), $$2, 0.0F);
   }

   public static dyc.a a(egw $$0, dmz $$1) {
      return new dyc.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dyc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(egw.c.fieldOf("target").forGetter($$0x -> $$0x.b), dmz.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dyc.a::new)
      );
      public final egw b;
      public final dmz c;

      a(egw $$0, dmz $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
