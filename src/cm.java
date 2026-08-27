import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cm extends dh<cm.a> {
   @Override
   public Codec<cm.a> a() {
      return cm.a.a;
   }

   public void a(aqu $$0, Collection<brv> $$1) {
      List<erp> $$2 = Lists.newArrayList();
      Set<bsb<?>> $$3 = Sets.newHashSet();

      for (brv $$4 : $$1) {
         $$3.add($$4.ak());
         $$2.add(bs.b($$0, $$4));
      }

      this.a($$0, $$2x -> $$2x.a($$2, $$3.size()));
   }

   public static record a(Optional<bd> b, List<bd> c, cu.d d) implements dh.a {
      public static final Codec<cm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(bs.b, "player").forGetter(cm.a::a),
                  axu.a(bs.b.listOf(), "victims", List.of()).forGetter(cm.a::b),
                  axu.a(cu.d.d, "unique_entity_types", cu.d.c).forGetter(cm.a::c)
               )
               .apply($$0, cm.a::new)
      );

      public static ao<cm.a> a(bs.a... $$0) {
         return an.H.a(new cm.a(Optional.empty(), bs.a($$0), cu.d.c));
      }

      public static ao<cm.a> a(cu.d $$0) {
         return an.H.a(new cm.a(Optional.empty(), List.of(), $$0));
      }

      public boolean a(Collection<erp> $$0, int $$1) {
         if (!this.c.isEmpty()) {
            List<erp> $$2 = Lists.newArrayList($$0);

            for (bd $$3 : this.c) {
               boolean $$4 = false;
               Iterator<erp> $$5 = $$2.iterator();

               while ($$5.hasNext()) {
                  erp $$6 = $$5.next();
                  if ($$3.a($$6)) {
                     $$5.remove();
                     $$4 = true;
                     break;
                  }
               }

               if (!$$4) {
                  return false;
               }
            }
         }

         return this.d.d($$1);
      }

      @Override
      public void a(be $$0) {
         dh.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public List<bd> b() {
         return this.c;
      }

      public cu.d c() {
         return this.d;
      }
   }
}
