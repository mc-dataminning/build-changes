import com.google.common.collect.ImmutableMap;

public class epr {
   public static final epz a = new epz(0, epz.a.a, epz.b.a, 3);
   public static final epz b = new epz(0, epz.a.b, epz.b.c, 4);
   public static final epz c = new epz(0, epz.a.a, epz.b.d, 2);
   public static final epz d = new epz(1, epz.a.e, epz.b.d, 2);
   public static final epz e = new epz(2, epz.a.e, epz.b.d, 2);
   public static final epz f = new epz(0, epz.a.c, epz.b.b, 3);
   public static final epz g = new epz(0, epz.a.c, epz.b.e, 1);
   public static final epz h = c;
   public static final epy i = new epy(ImmutableMap.builder().put("Position", a).put("UV", h).put("Color", b).build());
   public static final epy j = new epy(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final epy k = new epy(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV1", d).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final epy l = new epy(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("UV2", e).build());
   public static final epy m = new epy(ImmutableMap.builder().put("Position", a).build());
   public static final epy n = new epy(ImmutableMap.builder().put("Position", a).put("Color", b).build());
   public static final epy o = new epy(ImmutableMap.builder().put("Position", a).put("Color", b).put("Normal", f).put("Padding", g).build());
   public static final epy p = new epy(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV2", e).build());
   public static final epy q = new epy(ImmutableMap.builder().put("Position", a).put("UV0", c).build());
   public static final epy r = new epy(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).build());
   public static final epy s = new epy(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).build());
   public static final epy t = new epy(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).build());
   public static final epy u = new epy(ImmutableMap.builder().put("Position", a).put("UV0", c).put("UV2", e).put("Color", b).build());
   public static final epy v = new epy(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("Normal", f).put("Padding", g).build());
}
