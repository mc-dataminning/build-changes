import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public record dxh(List<dxh.b> d) implements dcs {
   static final Logger e = LogUtils.getLogger();
   public static final dxh a = new dxh(List.of());
   public static final Codec<dxh> b = dxh.b.a.listOf().xmap(dxh::new, dxh::b);
   public static final yw<wj, dxh> c = dxh.b.b.a(yu.a()).a(dxh::new, dxh::b);

   public dxh a() {
      return new dxh(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   @Override
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      for (int $$4 = 0; $$4 < Math.min(this.b().size(), 6); $$4++) {
         $$1.accept(this.b().get($$4).a().a(o.h));
      }
   }

   public List<dxh.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dxh.b> a = ImmutableList.builder();

      @Deprecated
      public dxh.a a(jg<dxg> $$0, alf<dxg> $$1, cyl $$2) {
         Optional<jf.c<dxg>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dxh.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dxh.a a(jf<dxg> $$0, cyl $$1) {
         return this.a(new dxh.b($$0, $$1));
      }

      public dxh.a a(dxh.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dxh.a a(dxh $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dxh a() {
         return new dxh(this.a.build());
      }
   }

   public static record b(jf<dxg> c, cyl d) {
      public static final Codec<dxh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dxg.c.fieldOf("pattern").forGetter(dxh.b::b), cyl.q.fieldOf("color").forGetter(dxh.b::c)).apply($$0, dxh.b::new)
      );
      public static final yw<wj, dxh.b> b = yw.a(dxg.d, dxh.b::b, cyl.r, dxh.b::c, dxh.b::new);

      public xm a() {
         String $$0 = this.c.a().b();
         return wy.c($$0 + "." + this.d.b());
      }

      public jf<dxg> b() {
         return this.c;
      }

      public cyl c() {
         return this.d;
      }
   }
}
