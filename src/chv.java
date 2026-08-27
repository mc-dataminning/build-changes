import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.function.Supplier;

public enum chv implements atr, chu {
   a("leather", 5, ac.a(new EnumMap<>(cht.a.class), $$0 -> {
      $$0.put(cht.a.d, 1);
      $$0.put(cht.a.c, 2);
      $$0.put(cht.a.b, 3);
      $$0.put(cht.a.a, 1);
   }), 15, aqd.ai, 0.0F, 0.0F, () -> cnk.a(ckm.pP)),
   b("chainmail", 15, ac.a(new EnumMap<>(cht.a.class), $$0 -> {
      $$0.put(cht.a.d, 1);
      $$0.put(cht.a.c, 4);
      $$0.put(cht.a.b, 5);
      $$0.put(cht.a.a, 2);
   }), 12, aqd.ac, 0.0F, 0.0F, () -> cnk.a(ckm.nQ)),
   c("iron", 15, ac.a(new EnumMap<>(cht.a.class), $$0 -> {
      $$0.put(cht.a.d, 2);
      $$0.put(cht.a.c, 5);
      $$0.put(cht.a.b, 6);
      $$0.put(cht.a.a, 2);
   }), 9, aqd.ah, 0.0F, 0.0F, () -> cnk.a(ckm.nQ)),
   d("gold", 7, ac.a(new EnumMap<>(cht.a.class), $$0 -> {
      $$0.put(cht.a.d, 1);
      $$0.put(cht.a.c, 3);
      $$0.put(cht.a.b, 5);
      $$0.put(cht.a.a, 2);
   }), 25, aqd.ag, 0.0F, 0.0F, () -> cnk.a(ckm.nU)),
   e("diamond", 33, ac.a(new EnumMap<>(cht.a.class), $$0 -> {
      $$0.put(cht.a.d, 3);
      $$0.put(cht.a.c, 6);
      $$0.put(cht.a.b, 8);
      $$0.put(cht.a.a, 3);
   }), 10, aqd.ad, 2.0F, 0.0F, () -> cnk.a(ckm.nK)),
   f("turtle", 25, ac.a(new EnumMap<>(cht.a.class), $$0 -> {
      $$0.put(cht.a.d, 2);
      $$0.put(cht.a.c, 5);
      $$0.put(cht.a.b, 6);
      $$0.put(cht.a.a, 2);
   }), 9, aqd.ak, 0.0F, 0.0F, () -> cnk.a(ckm.nD)),
   g("netherite", 37, ac.a(new EnumMap<>(cht.a.class), $$0 -> {
      $$0.put(cht.a.d, 3);
      $$0.put(cht.a.c, 6);
      $$0.put(cht.a.b, 8);
      $$0.put(cht.a.a, 3);
   }), 15, aqd.aj, 3.0F, 0.1F, () -> cnk.a(ckm.nV));

   public static final Codec<chv> h = atr.a(chv::values);
   private static final EnumMap<cht.a, Integer> i = ac.a(new EnumMap<>(cht.a.class), $$0 -> {
      $$0.put(cht.a.d, 13);
      $$0.put(cht.a.c, 15);
      $$0.put(cht.a.b, 16);
      $$0.put(cht.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<cht.a, Integer> l;
   private final int m;
   private final aqc n;
   private final float o;
   private final float p;
   private final ast<cnk> q;

   private chv(String $$0, int $$1, EnumMap<cht.a, Integer> $$2, int $$3, aqc $$4, float $$5, float $$6, Supplier<cnk> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new ast<>($$7);
   }

   @Override
   public int a(cht.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(cht.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public aqc b() {
      return this.n;
   }

   @Override
   public cnk d() {
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
