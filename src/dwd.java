import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public record dwd(List<dwd.b> d) implements dbx {
   static final Logger e = LogUtils.getLogger();
   public static final dwd a = new dwd(List.of());
   public static final Codec<dwd> b = dwd.b.a.listOf().xmap(dwd::new, dwd::b);
   public static final yu<wh, dwd> c = dwd.b.b.a(ys.a()).a(dwd::new, dwd::b);

   public dwd a() {
      return new dwd(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      for (int $$4 = 0; $$4 < Math.min(this.b().size(), 6); $$4++) {
         $$1.accept(this.b().get($$4).a().a(n.h));
      }
   }

   public List<dwd.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dwd.b> a = ImmutableList.builder();

      @Deprecated
      public dwd.a a(jf<dwc> $$0, ald<dwc> $$1, cxq $$2) {
         Optional<je.c<dwc>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dwd.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dwd.a a(je<dwc> $$0, cxq $$1) {
         return this.a(new dwd.b($$0, $$1));
      }

      public dwd.a a(dwd.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dwd.a a(dwd $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dwd a() {
         return new dwd(this.a.build());
      }
   }

   public static record b(je<dwc> c, cxq d) {
      public static final Codec<dwd.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dwc.c.fieldOf("pattern").forGetter(dwd.b::b), cxq.q.fieldOf("color").forGetter(dwd.b::c)).apply($$0, dwd.b::new)
      );
      public static final yu<wh, dwd.b> b = yu.a(dwc.d, dwd.b::b, cxq.r, dwd.b::c, dwd.b::new);

      public xk a() {
         String $$0 = this.c.a().b();
         return ww.c($$0 + "." + this.d.b());
      }

      public je<dwc> b() {
         return this.c;
      }

      public cxq c() {
         return this.d;
      }
   }
}
