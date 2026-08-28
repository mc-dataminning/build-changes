import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ejo implements eis {
   public static final Codec<ejo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekt.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               ely.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               ekt.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               eke.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               ekq.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               ekt.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               ejt.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               elm.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ejo::new)
   );
   public final ekt b;
   public final ekt c;
   public final ely d;
   public final ekt e;
   public final eke f;
   public final Optional<ekq> g;
   public final ejt h;
   public final List<elm> i;
   public final boolean j;
   public final boolean k;

   protected ejo(ekt $$0, ely $$1, ekt $$2, eke $$3, Optional<ekq> $$4, ekt $$5, ejt $$6, List<elm> $$7, boolean $$8, boolean $$9) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.c = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
      this.k = $$9;
   }

   public static class a {
      public final ekt a;
      private final ely c;
      public final ekt b;
      private final eke d;
      private final Optional<ekq> e;
      private ekt f;
      private final ejt g;
      private List<elm> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(ekt $$0, ely $$1, ekt $$2, eke $$3, Optional<ekq> $$4, ejt $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = ekt.a(dkg.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(ekt $$0, ely $$1, ekt $$2, eke $$3, ejt $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public ejo.a a(ekt $$0) {
         this.f = $$0;
         return this;
      }

      public ejo.a a(List<elm> $$0) {
         this.h = $$0;
         return this;
      }

      public ejo.a a() {
         this.i = true;
         return this;
      }

      public ejo.a b() {
         this.j = true;
         return this;
      }

      public ejo c() {
         return new ejo(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
