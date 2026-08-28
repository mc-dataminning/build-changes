import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class dzj {
   static final String a = "server_data";
   static Codec<dzj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jy.c.lenientOptionalFieldOf("rewarded_players", Set.of()).forGetter($$0x -> $$0x.e),
               Codec.LONG.lenientOptionalFieldOf("state_updating_resumes_at", 0L).forGetter($$0x -> $$0x.f),
               cyy.b.listOf().lenientOptionalFieldOf("items_to_eject", List.of()).forGetter($$0x -> $$0x.g),
               Codec.INT.lenientOptionalFieldOf("total_ejections_needed", 0).forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dzj::new)
   );
   private static final int d = 128;
   private final Set<UUID> e = new ObjectLinkedOpenHashSet();
   private long f;
   private final List<cyy> g = new ObjectArrayList();
   private long h;
   private int i;
   boolean c;

   dzj(Set<UUID> $$0, long $$1, List<cyy> $$2, int $$3) {
      this.e.addAll($$0);
      this.f = $$1;
      this.g.addAll($$2);
      this.i = $$3;
   }

   dzj() {
   }

   void a(long $$0) {
      this.h = $$0;
   }

   long a() {
      return this.h;
   }

   Set<UUID> b() {
      return this.e;
   }

   boolean a(cqy $$0) {
      return this.e.contains($$0.cG());
   }

   @VisibleForTesting
   public void b(cqy $$0) {
      this.e.add($$0.cG());
      if (this.e.size() > 128) {
         Iterator<UUID> $$1 = this.e.iterator();
         if ($$1.hasNext()) {
            $$1.next();
            $$1.remove();
         }
      }

      this.i();
   }

   long c() {
      return this.f;
   }

   void b(long $$0) {
      this.f = $$0;
      this.i();
   }

   List<cyy> d() {
      return this.g;
   }

   void e() {
      this.i = 0;
      this.i();
   }

   void a(List<cyy> $$0) {
      this.g.clear();
      this.g.addAll($$0);
      this.i = this.g.size();
      this.i();
   }

   cyy f() {
      return this.g.isEmpty() ? cyy.k : Objects.requireNonNullElse(this.g.get(this.g.size() - 1), cyy.k);
   }

   cyy g() {
      if (this.g.isEmpty()) {
         return cyy.k;
      } else {
         this.i();
         return Objects.requireNonNullElse(this.g.remove(this.g.size() - 1), cyy.k);
      }
   }

   void a(dzj $$0) {
      this.f = $$0.c();
      this.g.clear();
      this.g.addAll($$0.g);
      this.e.clear();
      this.e.addAll($$0.e);
   }

   private void i() {
      this.c = true;
   }

   public float h() {
      return this.i == 1 ? 1.0F : 1.0F - azm.f((float)this.d().size(), 1.0F, (float)this.i);
   }
}
