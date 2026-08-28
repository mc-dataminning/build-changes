import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class djx extends eya {
   private static final int c = 4;
   private static final Logger d = LogUtils.getLogger();
   private static final Codec<Pair<dih, arw>> e = Codec.mapPair(dih.a.fieldOf("chunk_pos"), arw.a).codec();
   public static final Codec<djx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.listOf().optionalFieldOf("tickets", List.of()).forGetter(djx::h)).apply($$0, djx::a)
   );
   public static final eyb<djx> b = new eyb<>("chunks", djx::new, a, bbb.i);
   private final Long2ObjectOpenHashMap<List<arw>> f;
   private final Long2ObjectOpenHashMap<List<arw>> g;
   private LongSet h = new LongOpenHashSet();
   @Nullable
   private djx.a i;
   @Nullable
   private djx.a j;

   private djx(Long2ObjectOpenHashMap<List<arw>> $$0, Long2ObjectOpenHashMap<List<arw>> $$1) {
      this.f = $$0;
      this.g = $$1;
      this.i();
   }

   public djx() {
      this(new Long2ObjectOpenHashMap(4), new Long2ObjectOpenHashMap());
   }

   private static djx a(List<Pair<dih, arw>> $$0) {
      Long2ObjectOpenHashMap<List<arw>> $$1 = new Long2ObjectOpenHashMap();

      for (Pair<dih, arw> $$2 : $$0) {
         dih $$3 = (dih)$$2.getFirst();
         List<arw> $$4 = (List<arw>)$$1.computeIfAbsent($$3.a(), $$0x -> new ObjectArrayList(4));
         $$4.add((arw)$$2.getSecond());
      }

      return new djx(new Long2ObjectOpenHashMap(4), $$1);
   }

   private List<Pair<dih, arw>> h() {
      List<Pair<dih, arw>> $$0 = new ArrayList<>();
      this.a((BiConsumer<dih, arw>)(($$1, $$2) -> {
         if ($$2.a().e()) {
            $$0.add(new Pair($$1, $$2));
         }
      }));
      return $$0;
   }

   private void a(BiConsumer<dih, arw> $$0) {
      a($$0, this.f);
      a($$0, this.g);
   }

   private static void a(BiConsumer<dih, arw> $$0, Long2ObjectOpenHashMap<List<arw>> $$1) {
      ObjectIterator var2 = Long2ObjectMaps.fastIterable($$1).iterator();

      while (var2.hasNext()) {
         Entry<List<arw>> $$2 = (Entry<List<arw>>)var2.next();
         dih $$3 = new dih($$2.getLongKey());

         for (arw $$4 : (List)$$2.getValue()) {
            $$0.accept($$3, $$4);
         }
      }
   }

   public void a() {
      ObjectIterator var1 = Long2ObjectMaps.fastIterable(this.g).iterator();

      while (var1.hasNext()) {
         Entry<List<arw>> $$0 = (Entry<List<arw>>)var1.next();

         for (arw $$1 : (List)$$0.getValue()) {
            this.a($$0.getLongKey(), $$1);
         }
      }

      this.g.clear();
   }

   public void a(@Nullable djx.a $$0) {
      this.i = $$0;
   }

   public void b(@Nullable djx.a $$0) {
      this.j = $$0;
   }

   public boolean b() {
      return !this.f.isEmpty();
   }

   public List<arw> a(long $$0) {
      return (List<arw>)this.f.getOrDefault($$0, List.of());
   }

   private List<arw> b(long $$0) {
      return (List<arw>)this.f.computeIfAbsent($$0, $$0x -> new ObjectArrayList(4));
   }

   public void a(arx $$0, dih $$1, int $$2) {
      arw $$3 = new arw($$0, aqt.a(are.b) - $$2);
      this.a($$1.a(), $$3);
   }

   public void a(arw $$0, dih $$1) {
      this.a($$1.a(), $$0);
   }

   public boolean a(long $$0, arw $$1) {
      List<arw> $$2 = this.b($$0);

      for (arw $$3 : $$2) {
         if (a($$1, $$3)) {
            $$3.c();
            this.f();
            return false;
         }
      }

      int $$4 = a($$2, true);
      int $$5 = a($$2, false);
      $$2.add($$1);
      if ($$1.a().b() && $$1.b() < $$4 && this.j != null) {
         this.j.update($$0, $$1.b(), true);
      }

      if ($$1.a().a() && $$1.b() < $$5 && this.i != null) {
         this.i.update($$0, $$1.b(), true);
      }

      if ($$1.a().equals(arx.f)) {
         this.h.add($$0);
      }

      this.f();
      return true;
   }

   private static boolean a(arw $$0, arw $$1) {
      return $$1.a() == $$0.a() && $$1.b() == $$0.b();
   }

   public int a(long $$0, boolean $$1) {
      return a(this.a($$0), $$1);
   }

   private static int a(List<arw> $$0, boolean $$1) {
      arw $$2 = b($$0, $$1);
      return $$2 == null ? aqt.b + 1 : $$2.b();
   }

   @Nullable
   private static arw b(@Nullable List<arw> $$0, boolean $$1) {
      if ($$0 == null) {
         return null;
      } else {
         arw $$2 = null;

         for (arw $$3 : $$0) {
            if ($$2 == null || $$3.b() < $$2.b()) {
               if ($$1 && $$3.a().b()) {
                  $$2 = $$3;
               } else if (!$$1 && $$3.a().a()) {
                  $$2 = $$3;
               }
            }
         }

         return $$2;
      }
   }

   public void b(arx $$0, dih $$1, int $$2) {
      arw $$3 = new arw($$0, aqt.a(are.b) - $$2);
      this.b($$1.a(), $$3);
   }

   public void b(arw $$0, dih $$1) {
      this.b($$1.a(), $$0);
   }

   public boolean b(long $$0, arw $$1) {
      List<arw> $$2 = (List<arw>)this.f.get($$0);
      if ($$2 == null) {
         return false;
      } else {
         boolean $$3 = false;
         Iterator<arw> $$4 = $$2.iterator();

         while ($$4.hasNext()) {
            arw $$5 = $$4.next();
            if (a($$1, $$5)) {
               $$4.remove();
               $$3 = true;
               break;
            }
         }

         if (!$$3) {
            return false;
         } else {
            if ($$2.isEmpty()) {
               this.f.remove($$0);
            }

            if ($$1.a().b() && this.j != null) {
               this.j.update($$0, a($$2, true), false);
            }

            if ($$1.a().a() && this.i != null) {
               this.i.update($$0, a($$2, false), false);
            }

            if ($$1.a().equals(arx.f)) {
               this.i();
            }

            this.f();
            return true;
         }
      }
   }

   private void i() {
      this.h = this.a((Predicate<arw>)($$0 -> $$0.a().equals(arx.f)));
   }

   public String b(long $$0, boolean $$1) {
      List<arw> $$2 = this.a($$0);
      arw $$3 = b($$2, $$1);
      return $$3 == null ? "no_ticket" : $$3.toString();
   }

   public void c() {
      this.a($$0 -> {
         $$0.d();
         return $$0.e();
      }, null);
      this.f();
   }

   public void d() {
      this.a($$0 -> $$0.a() != arx.i, this.g);
   }

   public void a(Predicate<arw> $$0, @Nullable Long2ObjectOpenHashMap<List<arw>> $$1) {
      ObjectIterator<Entry<List<arw>>> $$2 = this.f.long2ObjectEntrySet().fastIterator();
      boolean $$3 = false;

      while ($$2.hasNext()) {
         Entry<List<arw>> $$4 = (Entry<List<arw>>)$$2.next();
         Iterator<arw> $$5 = ((List)$$4.getValue()).iterator();
         boolean $$6 = false;
         boolean $$7 = false;

         while ($$5.hasNext()) {
            arw $$8 = $$5.next();
            if ($$0.test($$8)) {
               if ($$1 != null) {
                  List<arw> $$9 = (List<arw>)$$1.computeIfAbsent($$4.getLongKey(), $$1x -> new ObjectArrayList(((List)$$4.getValue()).size()));
                  $$9.add($$8);
               }

               $$5.remove();
               if ($$8.a().a()) {
                  $$7 = true;
               }

               if ($$8.a().b()) {
                  $$6 = true;
               }

               if ($$8.a().equals(arx.f)) {
                  $$3 = true;
               }
            }
         }

         if ($$7 || $$6) {
            if ($$7 && this.i != null) {
               this.i.update($$4.getLongKey(), a((List<arw>)$$4.getValue(), false), false);
            }

            if ($$6 && this.j != null) {
               this.j.update($$4.getLongKey(), a((List<arw>)$$4.getValue(), true), false);
            }

            this.f();
            if (((List)$$4.getValue()).isEmpty()) {
               $$2.remove();
            }
         }
      }

      if ($$3) {
         this.i();
      }
   }

   public void a(int $$0, arx $$1) {
      List<Pair<arw, Long>> $$2 = new ArrayList<>();
      ObjectIterator var4 = this.f.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<List<arw>> $$3 = (Entry<List<arw>>)var4.next();

         for (arw $$4 : (List)$$3.getValue()) {
            if ($$4.a() == $$1) {
               $$2.add(Pair.of($$4, $$3.getLongKey()));
            }
         }
      }

      for (Pair<arw, Long> $$5 : $$2) {
         Long $$6 = (Long)$$5.getSecond();
         arw $$7 = (arw)$$5.getFirst();
         this.b($$6, $$7);
         arx $$8 = $$7.a();
         this.a($$6, new arw($$8, $$0));
      }
   }

   public boolean a(dih $$0, boolean $$1) {
      arw $$2 = new arw(arx.f, aqu.c);
      return $$1 ? this.a($$0.a(), $$2) : this.b($$0.a(), $$2);
   }

   public LongSet e() {
      return this.h;
   }

   private LongSet a(Predicate<arw> $$0) {
      LongOpenHashSet $$1 = new LongOpenHashSet();
      ObjectIterator var3 = Long2ObjectMaps.fastIterable(this.f).iterator();

      while (var3.hasNext()) {
         Entry<List<arw>> $$2 = (Entry<List<arw>>)var3.next();

         for (arw $$3 : (List)$$2.getValue()) {
            if ($$0.test($$3)) {
               $$1.add($$2.getLongKey());
               break;
            }
         }
      }

      return $$1;
   }

   @FunctionalInterface
   public interface a {
      void update(long var1, int var3, boolean var4);
   }
}
