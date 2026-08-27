import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ce extends cx<ce.a> {
   @Override
   public Codec<ce.a> a() {
      return ce.a.a;
   }

   public void a(apt $$0, Collection<bpv> $$1) {
      List<enb> $$2 = Lists.newArrayList();
      Set<bqb<?>> $$3 = Sets.newHashSet();

      for (bpv $$4 : $$1) {
         $$3.add($$4.ai());
         $$2.add(br.b($$0, $$4));
      }

      this.a($$0, $$2x -> $$2x.a($$2, $$3.size()));
   }

   public static record a(Optional<bc> b, List<bc> c, cm.d d) implements cx.a {
      public static final Codec<ce.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aws.a(br.b, "player").forGetter(ce.a::a),
                  aws.a(br.b.listOf(), "victims", List.of()).forGetter(ce.a::b),
                  aws.a(cm.d.d, "unique_entity_types", cm.d.c).forGetter(ce.a::c)
               )
               .apply($$0, ce.a::new)
      );

      public static an<ce.a> a(br.a... $$0) {
         return am.H.a(new ce.a(Optional.empty(), br.a($$0), cm.d.c));
      }

      public static an<ce.a> a(cm.d $$0) {
         return am.H.a(new ce.a(Optional.empty(), List.of(), $$0));
      }

      public boolean a(Collection<enb> $$0, int $$1) {
         if (!this.c.isEmpty()) {
            List<enb> $$2 = Lists.newArrayList($$0);

            for (bc $$3 : this.c) {
               boolean $$4 = false;
               Iterator<enb> $$5 = $$2.iterator();

               while ($$5.hasNext()) {
                  enb $$6 = $$5.next();
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
      public void a(bd $$0) {
         cx.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public List<bc> b() {
         return this.c;
      }

      public cm.d c() {
         return this.d;
      }
   }
}
