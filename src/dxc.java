import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public record dxc(List<dxc.b> d) implements dcp {
   static final Logger e = LogUtils.getLogger();
   public static final dxc a = new dxc(List.of());
   public static final Codec<dxc> b = dxc.b.a.listOf().xmap(dxc::new, dxc::b);
   public static final yw<wj, dxc> c = dxc.b.b.a(yu.a()).a(dxc::new, dxc::b);

   public dxc a() {
      return new dxc(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      for (int $$4 = 0; $$4 < Math.min(this.b().size(), 6); $$4++) {
         $$1.accept(this.b().get($$4).a().a(o.h));
      }
   }

   public List<dxc.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dxc.b> a = ImmutableList.builder();

      @Deprecated
      public dxc.a a(jg<dxb> $$0, alf<dxb> $$1, cyi $$2) {
         Optional<jf.c<dxb>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dxc.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dxc.a a(jf<dxb> $$0, cyi $$1) {
         return this.a(new dxc.b($$0, $$1));
      }

      public dxc.a a(dxc.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dxc.a a(dxc $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dxc a() {
         return new dxc(this.a.build());
      }
   }

   public static record b(jf<dxb> c, cyi d) {
      public static final Codec<dxc.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dxb.c.fieldOf("pattern").forGetter(dxc.b::b), cyi.q.fieldOf("color").forGetter(dxc.b::c)).apply($$0, dxc.b::new)
      );
      public static final yw<wj, dxc.b> b = yw.a(dxb.d, dxc.b::b, cyi.r, dxc.b::c, dxc.b::new);

      public xm a() {
         String $$0 = this.c.a().b();
         return wy.c($$0 + "." + this.d.b());
      }

      public jf<dxb> b() {
         return this.c;
      }

      public cyi c() {
         return this.d;
      }
   }
}
