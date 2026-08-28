import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.List;
import java.util.Set;

public class eye extends exf {
   private static final Codec<List<eye.b>> b = eye.b.a.listOf().validate($$0 -> {
      Set<jr<btp>> $$1 = new ObjectOpenHashSet();

      for (eye.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<eye> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eye::new)
   );
   private final List<eye.b> c;

   eye(List<ezb> $$0, List<eye.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public exh<eye> b() {
      return exi.r;
   }

   @Override
   public Set<bai<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      if ($$0.a(cwu.wW) && !this.c.isEmpty()) {
         eye.b $$2 = af.a(this.c, $$1.b());
         jr<btp> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         czr.a $$5 = new czr.a($$3, $$4);
         $$0.a(kv.R, czr.a, $$5, czr::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eye.a c() {
      return new eye.a();
   }

   public static class a extends exf.a<eye.a> {
      private final Builder<eye.b> a = ImmutableList.builder();

      protected eye.a a() {
         return this;
      }

      public eye.a a(jr<btp> $$0, ezx $$1) {
         this.a.add(new eye.b($$0, $$1));
         return this;
      }

      @Override
      public exg b() {
         return new eye(this.g(), this.a.build());
      }
   }

   static record b(jr<btp> b, ezx c) {
      public static final Codec<eye.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(btp.a.fieldOf("type").forGetter(eye.b::a), ezy.a.fieldOf("duration").forGetter(eye.b::b)).apply($$0, eye.b::new)
      );

      public jr<btp> a() {
         return this.b;
      }

      public ezx b() {
         return this.c;
      }
   }
}
