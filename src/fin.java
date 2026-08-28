import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class fin implements Comparable<fin> {
   private static final Map<String, fin> h = Maps.newHashMap();
   private static final Map<fcd.a, fin> i = Maps.newHashMap();
   private static final Set<String> j = Sets.newHashSet();
   public static final String a = "key.categories.movement";
   public static final String b = "key.categories.misc";
   public static final String c = "key.categories.multiplayer";
   public static final String d = "key.categories.gameplay";
   public static final String e = "key.categories.inventory";
   public static final String f = "key.categories.ui";
   public static final String g = "key.categories.creative";
   private static final Map<String, Integer> k = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put("key.categories.movement", 1);
      $$0.put("key.categories.gameplay", 2);
      $$0.put("key.categories.inventory", 3);
      $$0.put("key.categories.creative", 4);
      $$0.put("key.categories.multiplayer", 5);
      $$0.put("key.categories.ui", 6);
      $$0.put("key.categories.misc", 7);
   });
   private final String l;
   private final fcd.a m;
   private final String n;
   private fcd.a o;
   private boolean p;
   private int q;

   public static void a(fcd.a $$0) {
      fin $$1 = i.get($$0);
      if ($$1 != null) {
         $$1.q++;
      }
   }

   public static void a(fcd.a $$0, boolean $$1) {
      fin $$2 = i.get($$0);
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   public static void a() {
      for (fin $$0 : h.values()) {
         if ($$0.o.a() == fcd.b.a && $$0.o.b() != fcd.bv.b()) {
            $$0.a(fcd.a(fip.Q().aP().i(), $$0.o.b()));
         }
      }
   }

   public static void b() {
      for (fin $$0 : h.values()) {
         $$0.n();
      }
   }

   public static void c() {
      for (fin $$0 : h.values()) {
         if ($$0 instanceof fjb $$1) {
            $$1.n();
         }
      }
   }

   public static void d() {
      i.clear();

      for (fin $$0 : h.values()) {
         i.put($$0.o, $$0);
      }
   }

   public fin(String $$0, int $$1, String $$2) {
      this($$0, fcd.b.a, $$1, $$2);
   }

   public fin(String $$0, fcd.b $$1, int $$2, String $$3) {
      this.l = $$0;
      this.o = $$1.a($$2);
      this.m = this.o;
      this.n = $$3;
      h.put($$0, this);
      i.put(this.o, this);
      j.add($$3);
   }

   public boolean e() {
      return this.p;
   }

   public String f() {
      return this.n;
   }

   public boolean g() {
      if (this.q == 0) {
         return false;
      } else {
         this.q--;
         return true;
      }
   }

   private void n() {
      this.q = 0;
      this.a(false);
   }

   public String h() {
      return this.l;
   }

   public fcd.a i() {
      return this.m;
   }

   public void b(fcd.a $$0) {
      this.o = $$0;
   }

   public int a(fin $$0) {
      return this.n.equals($$0.n) ? gyn.a(this.l).compareTo(gyn.a($$0.l)) : k.get(this.n).compareTo(k.get($$0.n));
   }

   public static Supplier<xe> a(String $$0) {
      fin $$1 = h.get($$0);
      return $$1 == null ? () -> xe.c($$0) : $$1::k;
   }

   public boolean b(fin $$0) {
      return this.o.equals($$0.o);
   }

   public boolean j() {
      return this.o.equals(fcd.bv);
   }

   public boolean a(int $$0, int $$1) {
      return $$0 == fcd.bv.b() ? this.o.a() == fcd.b.b && this.o.b() == $$1 : this.o.a() == fcd.b.a && this.o.b() == $$0;
   }

   public boolean a(int $$0) {
      return this.o.a() == fcd.b.c && this.o.b() == $$0;
   }

   public xe k() {
      return this.o.d();
   }

   public boolean l() {
      return this.o.equals(this.m);
   }

   public String m() {
      return this.o.c();
   }

   public void a(boolean $$0) {
      this.p = $$0;
   }
}
