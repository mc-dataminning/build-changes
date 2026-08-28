import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dun(List<dun.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dun a = new dun(List.of());
   public static final Codec<dun> b = dun.b.a.listOf().xmap(dun::new, dun::b);
   public static final zt<xg, dun> c = dun.b.b.a(zr.a()).a(dun::new, dun::b);

   public dun a() {
      return new dun(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dun.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dun.b> a = ImmutableList.builder();

      @Deprecated
      public dun.a a(jr<dum> $$0, aly<dum> $$1, cwl $$2) {
         Optional<jq.c<dum>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dun.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dun.a a(jq<dum> $$0, cwl $$1) {
         return this.a(new dun.b($$0, $$1));
      }

      public dun.a a(dun.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dun.a a(dun $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dun a() {
         return new dun(this.a.build());
      }
   }

   public static record b(jq<dum> c, cwl d) {
      public static final Codec<dun.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dum.c.fieldOf("pattern").forGetter(dun.b::b), cwl.q.fieldOf("color").forGetter(dun.b::c)).apply($$0, dun.b::new)
      );
      public static final zt<xg, dun.b> b = zt.a(dum.d, dun.b::b, cwl.r, dun.b::c, dun.b::new);

      public yj a() {
         String $$0 = this.c.a().b();
         return xv.c($$0 + "." + this.d.b());
      }

      public jq<dum> b() {
         return this.c;
      }

      public cwl c() {
         return this.d;
      }
   }
}
