import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edw implements edo {
   public static final Codec<edw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(edw.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edw::new)
   );
   public final List<edw.a> b;
   public final int c;
   public final float d;

   public edw(List<edw.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public edw(List<edw.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public edw(emq $$0, dsk $$1, int $$2, float $$3) {
      this(ImmutableList.of(new edw.a($$0, $$1)), $$2, $$3);
   }

   public edw(emq $$0, dsk $$1, int $$2) {
      this(ImmutableList.of(new edw.a($$0, $$1)), $$2, 0.0F);
   }

   public static edw.a a(emq $$0, dsk $$1) {
      return new edw.a($$0, $$1);
   }

   public static class a {
      public static final Codec<edw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(emq.c.fieldOf("target").forGetter($$0x -> $$0x.b), dsk.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, edw.a::new)
      );
      public final emq b;
      public final dsk c;

      a(emq $$0, dsk $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
