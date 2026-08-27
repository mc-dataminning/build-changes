import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.function.Supplier;

public enum cml implements axc, cmk {
   a("leather", 5, ac.a(new EnumMap<>(cmj.a.class), $$0 -> {
      $$0.put(cmj.a.d, 1);
      $$0.put(cmj.a.c, 2);
      $$0.put(cmj.a.b, 3);
      $$0.put(cmj.a.a, 1);
   }), 15, atk.as, 0.0F, 0.0F, () -> cry.a(cpc.qC)),
   b("chainmail", 15, ac.a(new EnumMap<>(cmj.a.class), $$0 -> {
      $$0.put(cmj.a.d, 1);
      $$0.put(cmj.a.c, 4);
      $$0.put(cmj.a.b, 5);
      $$0.put(cmj.a.a, 2);
   }), 12, atk.am, 0.0F, 0.0F, () -> cry.a(cpc.oD)),
   c("iron", 15, ac.a(new EnumMap<>(cmj.a.class), $$0 -> {
      $$0.put(cmj.a.d, 2);
      $$0.put(cmj.a.c, 5);
      $$0.put(cmj.a.b, 6);
      $$0.put(cmj.a.a, 2);
   }), 9, atk.ar, 0.0F, 0.0F, () -> cry.a(cpc.oD)),
   d("gold", 7, ac.a(new EnumMap<>(cmj.a.class), $$0 -> {
      $$0.put(cmj.a.d, 1);
      $$0.put(cmj.a.c, 3);
      $$0.put(cmj.a.b, 5);
      $$0.put(cmj.a.a, 2);
   }), 25, atk.aq, 0.0F, 0.0F, () -> cry.a(cpc.oH)),
   e("diamond", 33, ac.a(new EnumMap<>(cmj.a.class), $$0 -> {
      $$0.put(cmj.a.d, 3);
      $$0.put(cmj.a.c, 6);
      $$0.put(cmj.a.b, 8);
      $$0.put(cmj.a.a, 3);
   }), 10, atk.an, 2.0F, 0.0F, () -> cry.a(cpc.ox)),
   f("turtle", 25, ac.a(new EnumMap<>(cmj.a.class), $$0 -> {
      $$0.put(cmj.a.d, 2);
      $$0.put(cmj.a.c, 5);
      $$0.put(cmj.a.b, 6);
      $$0.put(cmj.a.a, 2);
   }), 9, atk.au, 0.0F, 0.0F, () -> cry.a(cpc.oo)),
   g("netherite", 37, ac.a(new EnumMap<>(cmj.a.class), $$0 -> {
      $$0.put(cmj.a.d, 3);
      $$0.put(cmj.a.c, 6);
      $$0.put(cmj.a.b, 8);
      $$0.put(cmj.a.a, 3);
   }), 15, atk.at, 3.0F, 0.1F, () -> cry.a(cpc.oI));

   public static final Codec<cml> h = axc.a(cml::values);
   private static final EnumMap<cmj.a, Integer> i = ac.a(new EnumMap<>(cmj.a.class), $$0 -> {
      $$0.put(cmj.a.d, 13);
      $$0.put(cmj.a.c, 15);
      $$0.put(cmj.a.b, 16);
      $$0.put(cmj.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<cmj.a, Integer> l;
   private final int m;
   private final atj n;
   private final float o;
   private final float p;
   private final awc<cry> q;

   private cml(String $$0, int $$1, EnumMap<cmj.a, Integer> $$2, int $$3, atj $$4, float $$5, float $$6, Supplier<cry> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new awc<>($$7);
   }

   @Override
   public int a(cmj.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(cmj.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public atj b() {
      return this.n;
   }

   @Override
   public cry d() {
      return this.q.a();
   }

   @Override
   public String e() {
      return this.j;
   }

   @Override
   public float f() {
      return this.o;
   }

   @Override
   public float g() {
      return this.p;
   }

   @Override
   public String c() {
      return this.j;
   }
}
