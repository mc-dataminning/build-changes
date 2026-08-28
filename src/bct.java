import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JavaOps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class bct {
   private static final Dynamic<?>[] b = new Dynamic[4096];
   private static final Dynamic<?>[] c = new Dynamic[256];
   private static final Object2IntMap<Dynamic<?>> d = (Object2IntMap<Dynamic<?>>)DataFixUtils.make(
      new Object2IntOpenHashMap(), $$0 -> $$0.defaultReturnValue(-1)
   );
   private static final Object2IntMap<String> e = (Object2IntMap<String>)DataFixUtils.make(new Object2IntOpenHashMap(), $$0 -> $$0.defaultReturnValue(-1));
   static final String a = "%%FILTER_ME%%";
   private static final String f = "Name";
   private static final String g = "Properties";
   private static final Map<String, String> h = Map.of("age", "0");
   private static final Map<String, String> i = Map.of("age", "0", "facing", "east");
   private static final Map<String, String> j = Map.of("age", "0", "facing", "north");
   private static final Map<String, String> k = Map.of("age", "0", "facing", "south");
   private static final Map<String, String> l = Map.of("age", "0", "facing", "west");
   private static final Map<String, String> m = Map.of("age", "1");
   private static final Map<String, String> n = Map.of("age", "10");
   private static final Map<String, String> o = Map.of("age", "11");
   private static final Map<String, String> p = Map.of("age", "12");
   private static final Map<String, String> q = Map.of("age", "13");
   private static final Map<String, String> r = Map.of("age", "14");
   private static final Map<String, String> s = Map.of("age", "15");
   private static final Map<String, String> t = Map.of("age", "1", "facing", "east");
   private static final Map<String, String> u = Map.of("age", "1", "facing", "north");
   private static final Map<String, String> v = Map.of("age", "1", "facing", "south");
   private static final Map<String, String> w = Map.of("age", "1", "facing", "west");
   private static final Map<String, String> x = Map.of("age", "2");
   private static final Map<String, String> y = Map.of("age", "2", "facing", "east");
   private static final Map<String, String> z = Map.of("age", "2", "facing", "north");
   private static final Map<String, String> A = Map.of("age", "2", "facing", "south");
   private static final Map<String, String> B = Map.of("age", "2", "facing", "west");
   private static final Map<String, String> C = Map.of("age", "3");
   private static final Map<String, String> D = Map.of("age", "4");
   private static final Map<String, String> E = Map.of("age", "5");
   private static final Map<String, String> F = Map.of("age", "6");
   private static final Map<String, String> G = Map.of("age", "7");
   private static final Map<String, String> H = Map.of("age", "8");
   private static final Map<String, String> I = Map.of("age", "9");
   private static final Map<String, String> J = Map.of("axis", "x");
   private static final Map<String, String> K = Map.of("axis", "y");
   private static final Map<String, String> L = Map.of("axis", "z");
   private static final Map<String, String> M = Map.of("check_decay", "false", "decayable", "false");
   private static final Map<String, String> N = Map.of("check_decay", "false", "decayable", "true");
   private static final Map<String, String> O = Map.of("check_decay", "true", "decayable", "false");
   private static final Map<String, String> P = Map.of("check_decay", "true", "decayable", "true");
   private static final Map<String, String> Q = Map.of("color", "black");
   private static final Map<String, String> R = Map.of("color", "blue");
   private static final Map<String, String> S = Map.of("color", "brown");
   private static final Map<String, String> T = Map.of("color", "cyan");
   private static final Map<String, String> U = Map.of("color", "gray");
   private static final Map<String, String> V = Map.of("color", "green");
   private static final Map<String, String> W = Map.of("color", "light_blue");
   private static final Map<String, String> X = Map.of("color", "lime");
   private static final Map<String, String> Y = Map.of("color", "magenta");
   private static final Map<String, String> Z = Map.of("color", "orange");
   private static final Map<String, String> aa = Map.of("color", "pink");
   private static final Map<String, String> ab = Map.of("color", "purple");
   private static final Map<String, String> ac = Map.of("color", "red");
   private static final Map<String, String> ad = Map.of("color", "silver");
   private static final Map<String, String> ae = Map.of("color", "white");
   private static final Map<String, String> af = Map.of("color", "yellow");
   private static final Map<String, String> ag = Map.of(
      "attached", "false", "disarmed", "false", "east", "false", "north", "false", "powered", "false", "south", "false", "west", "false"
   );
   private static final Map<String, String> ah = Map.of(
      "attached", "false", "disarmed", "false", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "false"
   );
   private static final Map<String, String> ai = Map.of(
      "attached", "false", "disarmed", "true", "east", "false", "north", "false", "powered", "false", "south", "false", "west", "false"
   );
   private static final Map<String, String> aj = Map.of(
      "attached", "false", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "false"
   );
   private static final Map<String, String> ak = Map.of(
      "attached", "true", "disarmed", "false", "east", "false", "north", "false", "powered", "false", "south", "false", "west", "false"
   );
   private static final Map<String, String> al = Map.of(
      "attached", "true", "disarmed", "false", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "false"
   );
   private static final Map<String, String> am = Map.of(
      "attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "false", "south", "false", "west", "false"
   );
   private static final Map<String, String> an = Map.of("face", "ceiling", "facing", "north", "powered", "false");
   private static final Map<String, String> ao = Map.of("face", "ceiling", "facing", "north", "powered", "true");
   private static final Map<String, String> ap = Map.of("face", "floor", "facing", "north", "powered", "false");
   private static final Map<String, String> aq = Map.of("face", "floor", "facing", "north", "powered", "true");
   private static final Map<String, String> ar = Map.of("face", "wall", "facing", "east", "powered", "false");
   private static final Map<String, String> as = Map.of("face", "wall", "facing", "north", "powered", "false");
   private static final Map<String, String> at = Map.of("face", "wall", "facing", "south", "powered", "false");
   private static final Map<String, String> au = Map.of("face", "wall", "facing", "west", "powered", "false");
   private static final Map<String, String> av = Map.of("face", "wall", "facing", "east", "powered", "true");
   private static final Map<String, String> aw = Map.of("face", "wall", "facing", "north", "powered", "true");
   private static final Map<String, String> ax = Map.of("face", "wall", "facing", "south", "powered", "true");
   private static final Map<String, String> ay = Map.of("face", "wall", "facing", "west", "powered", "true");
   private static final Map<String, String> az = Map.of("facing", "down");
   private static final Map<String, String> aA = Map.of("conditional", "false", "facing", "down");
   private static final Map<String, String> aB = Map.of("conditional", "true", "facing", "down");
   private static final Map<String, String> aC = Map.of("extended", "false", "facing", "down");
   private static final Map<String, String> aD = Map.of("extended", "true", "facing", "down");
   private static final Map<String, String> aE = Map.of("facing", "down", "powered", "false");
   private static final Map<String, String> aF = Map.of("facing", "down", "powered", "true");
   private static final Map<String, String> aG = Map.of("facing", "east");
   private static final Map<String, String> aH = Map.of("conditional", "false", "facing", "east");
   private static final Map<String, String> aI = Map.of("conditional", "true", "facing", "east");
   private static final Map<String, String> aJ = Map.of("extended", "false", "facing", "east");
   private static final Map<String, String> aK = Map.of("extended", "true", "facing", "east");
   private static final Map<String, String> aL = Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "false", "powered", "false");
   private static final Map<String, String> aM = Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "false", "powered", "false");
   private static final Map<String, String> aN = Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "false", "powered", "false");
   private static final Map<String, String> aO = Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "false", "powered", "false");
   private static final Map<String, String> aP = Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "false", "powered", "true");
   private static final Map<String, String> aQ = Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "false", "powered", "true");
   private static final Map<String, String> aR = Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "false", "powered", "true");
   private static final Map<String, String> aS = Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "false", "powered", "true");
   private static final Map<String, String> aT = Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "true", "powered", "false");
   private static final Map<String, String> aU = Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "true", "powered", "false");
   private static final Map<String, String> aV = Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "true", "powered", "false");
   private static final Map<String, String> aW = Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "true", "powered", "false");
   private static final Map<String, String> aX = Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "true", "powered", "true");
   private static final Map<String, String> aY = Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "true", "powered", "true");
   private static final Map<String, String> aZ = Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "true", "powered", "true");
   private static final Map<String, String> ba = Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "true", "powered", "true");
   private static final Map<String, String> bb = Map.of("facing", "east", "powered", "false");
   private static final Map<String, String> bc = Map.of("facing", "east", "powered", "true");
   private static final Map<String, String> bd = Map.of("facing", "north");
   private static final Map<String, String> be = Map.of("conditional", "false", "facing", "north");
   private static final Map<String, String> bf = Map.of("conditional", "true", "facing", "north");
   private static final Map<String, String> bg = Map.of("extended", "false", "facing", "north");
   private static final Map<String, String> bh = Map.of("extended", "true", "facing", "north");
   private static final Map<String, String> bi = Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "false", "powered", "false");
   private static final Map<String, String> bj = Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "false", "powered", "false");
   private static final Map<String, String> bk = Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "false", "powered", "false");
   private static final Map<String, String> bl = Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "false", "powered", "false");
   private static final Map<String, String> bm = Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "false", "powered", "true");
   private static final Map<String, String> bn = Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "false", "powered", "true");
   private static final Map<String, String> bo = Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "false", "powered", "true");
   private static final Map<String, String> bp = Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "false", "powered", "true");
   private static final Map<String, String> bq = Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "true", "powered", "false");
   private static final Map<String, String> br = Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "true", "powered", "false");
   private static final Map<String, String> bs = Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "true", "powered", "false");
   private static final Map<String, String> bt = Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "true", "powered", "false");
   private static final Map<String, String> bu = Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "true", "powered", "true");
   private static final Map<String, String> bv = Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "true", "powered", "true");
   private static final Map<String, String> bw = Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "true", "powered", "true");
   private static final Map<String, String> bx = Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "true", "powered", "true");
   private static final Map<String, String> by = Map.of("facing", "north", "powered", "false");
   private static final Map<String, String> bz = Map.of("facing", "north", "powered", "true");
   private static final Map<String, String> bA = Map.of("facing", "south");
   private static final Map<String, String> bB = Map.of("conditional", "false", "facing", "south");
   private static final Map<String, String> bC = Map.of("conditional", "true", "facing", "south");
   private static final Map<String, String> bD = Map.of("extended", "false", "facing", "south");
   private static final Map<String, String> bE = Map.of("extended", "true", "facing", "south");
   private static final Map<String, String> bF = Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "false", "powered", "false");
   private static final Map<String, String> bG = Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "false", "powered", "false");
   private static final Map<String, String> bH = Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "false", "powered", "false");
   private static final Map<String, String> bI = Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "false", "powered", "false");
   private static final Map<String, String> bJ = Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "false", "powered", "true");
   private static final Map<String, String> bK = Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "false", "powered", "true");
   private static final Map<String, String> bL = Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "false", "powered", "true");
   private static final Map<String, String> bM = Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "false", "powered", "true");
   private static final Map<String, String> bN = Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "true", "powered", "false");
   private static final Map<String, String> bO = Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "true", "powered", "false");
   private static final Map<String, String> bP = Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "true", "powered", "false");
   private static final Map<String, String> bQ = Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "true", "powered", "false");
   private static final Map<String, String> bR = Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "true", "powered", "true");
   private static final Map<String, String> bS = Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "true", "powered", "true");
   private static final Map<String, String> bT = Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "true", "powered", "true");
   private static final Map<String, String> bU = Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "true", "powered", "true");
   private static final Map<String, String> bV = Map.of("facing", "south", "powered", "false");
   private static final Map<String, String> bW = Map.of("facing", "south", "powered", "true");
   private static final Map<String, String> bX = Map.of("facing", "up");
   private static final Map<String, String> bY = Map.of("conditional", "false", "facing", "up");
   private static final Map<String, String> bZ = Map.of("conditional", "true", "facing", "up");
   private static final Map<String, String> ca = Map.of("extended", "false", "facing", "up");
   private static final Map<String, String> cb = Map.of("extended", "true", "facing", "up");
   private static final Map<String, String> cc = Map.of("facing", "up", "powered", "false");
   private static final Map<String, String> cd = Map.of("facing", "up", "powered", "true");
   private static final Map<String, String> ce = Map.of("facing", "west");
   private static final Map<String, String> cf = Map.of("conditional", "false", "facing", "west");
   private static final Map<String, String> cg = Map.of("conditional", "true", "facing", "west");
   private static final Map<String, String> ch = Map.of("extended", "false", "facing", "west");
   private static final Map<String, String> ci = Map.of("extended", "true", "facing", "west");
   private static final Map<String, String> cj = Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "false", "powered", "false");
   private static final Map<String, String> ck = Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "false", "powered", "false");
   private static final Map<String, String> cl = Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "false", "powered", "false");
   private static final Map<String, String> cm = Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "false", "powered", "false");
   private static final Map<String, String> cn = Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "false", "powered", "true");
   private static final Map<String, String> co = Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "false", "powered", "true");
   private static final Map<String, String> cp = Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "false", "powered", "true");
   private static final Map<String, String> cq = Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "false", "powered", "true");
   private static final Map<String, String> cr = Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "true", "powered", "false");
   private static final Map<String, String> cs = Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "true", "powered", "false");
   private static final Map<String, String> ct = Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "true", "powered", "false");
   private static final Map<String, String> cu = Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "true", "powered", "false");
   private static final Map<String, String> cv = Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "true", "powered", "true");
   private static final Map<String, String> cw = Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "true", "powered", "true");
   private static final Map<String, String> cx = Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "true", "powered", "true");
   private static final Map<String, String> cy = Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "true", "powered", "true");
   private static final Map<String, String> cz = Map.of("facing", "west", "powered", "false");
   private static final Map<String, String> cA = Map.of("facing", "west", "powered", "true");
   private static final Map<String, String> cB = Map.of("facing", "east", "half", "bottom", "open", "false");
   private static final Map<String, String> cC = Map.of("facing", "north", "half", "bottom", "open", "false");
   private static final Map<String, String> cD = Map.of("facing", "south", "half", "bottom", "open", "false");
   private static final Map<String, String> cE = Map.of("facing", "west", "half", "bottom", "open", "false");
   private static final Map<String, String> cF = Map.of("facing", "east", "half", "bottom", "open", "true");
   private static final Map<String, String> cG = Map.of("facing", "north", "half", "bottom", "open", "true");
   private static final Map<String, String> cH = Map.of("facing", "south", "half", "bottom", "open", "true");
   private static final Map<String, String> cI = Map.of("facing", "west", "half", "bottom", "open", "true");
   private static final Map<String, String> cJ = Map.of("facing", "east", "half", "bottom", "shape", "inner_left");
   private static final Map<String, String> cK = Map.of("facing", "north", "half", "bottom", "shape", "inner_left");
   private static final Map<String, String> cL = Map.of("facing", "south", "half", "bottom", "shape", "inner_left");
   private static final Map<String, String> cM = Map.of("facing", "west", "half", "bottom", "shape", "inner_left");
   private static final Map<String, String> cN = Map.of("facing", "east", "half", "bottom", "shape", "inner_right");
   private static final Map<String, String> cO = Map.of("facing", "north", "half", "bottom", "shape", "inner_right");
   private static final Map<String, String> cP = Map.of("facing", "south", "half", "bottom", "shape", "inner_right");
   private static final Map<String, String> cQ = Map.of("facing", "west", "half", "bottom", "shape", "inner_right");
   private static final Map<String, String> cR = Map.of("facing", "east", "half", "bottom", "shape", "outer_left");
   private static final Map<String, String> cS = Map.of("facing", "north", "half", "bottom", "shape", "outer_left");
   private static final Map<String, String> cT = Map.of("facing", "south", "half", "bottom", "shape", "outer_left");
   private static final Map<String, String> cU = Map.of("facing", "west", "half", "bottom", "shape", "outer_left");
   private static final Map<String, String> cV = Map.of("facing", "east", "half", "bottom", "shape", "outer_right");
   private static final Map<String, String> cW = Map.of("facing", "north", "half", "bottom", "shape", "outer_right");
   private static final Map<String, String> cX = Map.of("facing", "south", "half", "bottom", "shape", "outer_right");
   private static final Map<String, String> cY = Map.of("facing", "west", "half", "bottom", "shape", "outer_right");
   private static final Map<String, String> cZ = Map.of("facing", "east", "half", "bottom", "shape", "straight");
   private static final Map<String, String> da = Map.of("facing", "north", "half", "bottom", "shape", "straight");
   private static final Map<String, String> db = Map.of("facing", "south", "half", "bottom", "shape", "straight");
   private static final Map<String, String> dc = Map.of("facing", "west", "half", "bottom", "shape", "straight");
   private static final Map<String, String> dd = Map.of("half", "lower");
   private static final Map<String, String> de = Map.of("facing", "east", "half", "top", "open", "false");
   private static final Map<String, String> df = Map.of("facing", "north", "half", "top", "open", "false");
   private static final Map<String, String> dg = Map.of("facing", "south", "half", "top", "open", "false");
   private static final Map<String, String> dh = Map.of("facing", "west", "half", "top", "open", "false");
   private static final Map<String, String> di = Map.of("facing", "east", "half", "top", "open", "true");
   private static final Map<String, String> dj = Map.of("facing", "north", "half", "top", "open", "true");
   private static final Map<String, String> dk = Map.of("facing", "south", "half", "top", "open", "true");
   private static final Map<String, String> dl = Map.of("facing", "west", "half", "top", "open", "true");
   private static final Map<String, String> dm = Map.of("facing", "east", "half", "top", "shape", "inner_left");
   private static final Map<String, String> dn = Map.of("facing", "north", "half", "top", "shape", "inner_left");
   private static final Map<String, String> do = Map.of("facing", "south", "half", "top", "shape", "inner_left");
   private static final Map<String, String> dp = Map.of("facing", "west", "half", "top", "shape", "inner_left");
   private static final Map<String, String> dq = Map.of("facing", "east", "half", "top", "shape", "inner_right");
   private static final Map<String, String> dr = Map.of("facing", "north", "half", "top", "shape", "inner_right");
   private static final Map<String, String> ds = Map.of("facing", "south", "half", "top", "shape", "inner_right");
   private static final Map<String, String> dt = Map.of("facing", "west", "half", "top", "shape", "inner_right");
   private static final Map<String, String> du = Map.of("facing", "east", "half", "top", "shape", "outer_left");
   private static final Map<String, String> dv = Map.of("facing", "north", "half", "top", "shape", "outer_left");
   private static final Map<String, String> dw = Map.of("facing", "south", "half", "top", "shape", "outer_left");
   private static final Map<String, String> dx = Map.of("facing", "west", "half", "top", "shape", "outer_left");
   private static final Map<String, String> dy = Map.of("facing", "east", "half", "top", "shape", "outer_right");
   private static final Map<String, String> dz = Map.of("facing", "north", "half", "top", "shape", "outer_right");
   private static final Map<String, String> dA = Map.of("facing", "south", "half", "top", "shape", "outer_right");
   private static final Map<String, String> dB = Map.of("facing", "west", "half", "top", "shape", "outer_right");
   private static final Map<String, String> dC = Map.of("facing", "east", "half", "top", "shape", "straight");
   private static final Map<String, String> dD = Map.of("facing", "north", "half", "top", "shape", "straight");
   private static final Map<String, String> dE = Map.of("facing", "south", "half", "top", "shape", "straight");
   private static final Map<String, String> dF = Map.of("facing", "west", "half", "top", "shape", "straight");
   private static final Map<String, String> dG = Map.of("half", "upper");
   private static final Map<String, String> dH = Map.of("level", "0");
   private static final Map<String, String> dI = Map.of("level", "1");
   private static final Map<String, String> dJ = Map.of("level", "10");
   private static final Map<String, String> dK = Map.of("level", "11");
   private static final Map<String, String> dL = Map.of("level", "12");
   private static final Map<String, String> dM = Map.of("level", "13");
   private static final Map<String, String> dN = Map.of("level", "14");
   private static final Map<String, String> dO = Map.of("level", "15");
   private static final Map<String, String> dP = Map.of("level", "2");
   private static final Map<String, String> dQ = Map.of("level", "3");
   private static final Map<String, String> dR = Map.of("level", "4");
   private static final Map<String, String> dS = Map.of("level", "5");
   private static final Map<String, String> dT = Map.of("level", "6");
   private static final Map<String, String> dU = Map.of("level", "7");
   private static final Map<String, String> dV = Map.of("level", "8");
   private static final Map<String, String> dW = Map.of("level", "9");
   private static final Map<String, String> dX = Map.of("lit", "false");
   private static final Map<String, String> dY = Map.of("lit", "true");
   private static final Map<String, String> dZ = Map.of("down", "false", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false");
   private static final Map<String, String> ea = Map.of("down", "false", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false");
   private static final Map<String, String> eb = Map.of("down", "false", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false");
   private static final Map<String, String> ec = Map.of("down", "false", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true");
   private static final Map<String, String> ed = Map.of("down", "false", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true");
   private static final Map<String, String> ee = Map.of("down", "false", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false");
   private static final Map<String, String> ef = Map.of("down", "false", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false");
   private static final Map<String, String> eg = Map.of("down", "false", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false");
   private static final Map<String, String> eh = Map.of("down", "false", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true");
   private static final Map<String, String> ei = Map.of("down", "false", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true");
   private static final Map<String, String> ej = Map.of("down", "false", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false");
   private static final Map<String, String> ek = Map.of("down", "true", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true");
   private static final Map<String, String> el = Map.of("powered", "false");
   private static final Map<String, String> em = Map.of("facing", "east", "in_wall", "false", "open", "false", "powered", "false");
   private static final Map<String, String> en = Map.of("facing", "north", "in_wall", "false", "open", "false", "powered", "false");
   private static final Map<String, String> eo = Map.of("facing", "south", "in_wall", "false", "open", "false", "powered", "false");
   private static final Map<String, String> ep = Map.of("facing", "west", "in_wall", "false", "open", "false", "powered", "false");
   private static final Map<String, String> eq = Map.of("facing", "east", "in_wall", "false", "open", "true", "powered", "false");
   private static final Map<String, String> er = Map.of("facing", "north", "in_wall", "false", "open", "true", "powered", "false");
   private static final Map<String, String> es = Map.of("facing", "south", "in_wall", "false", "open", "true", "powered", "false");
   private static final Map<String, String> et = Map.of("facing", "west", "in_wall", "false", "open", "true", "powered", "false");
   private static final Map<String, String> eu = Map.of("facing", "east", "in_wall", "true", "open", "false", "powered", "false");
   private static final Map<String, String> ev = Map.of("facing", "north", "in_wall", "true", "open", "false", "powered", "false");
   private static final Map<String, String> ew = Map.of("facing", "south", "in_wall", "true", "open", "false", "powered", "false");
   private static final Map<String, String> ex = Map.of("facing", "west", "in_wall", "true", "open", "false", "powered", "false");
   private static final Map<String, String> ey = Map.of("facing", "east", "in_wall", "true", "open", "true", "powered", "false");
   private static final Map<String, String> ez = Map.of("facing", "north", "in_wall", "true", "open", "true", "powered", "false");
   private static final Map<String, String> eA = Map.of("facing", "south", "in_wall", "true", "open", "true", "powered", "false");
   private static final Map<String, String> eB = Map.of("facing", "west", "in_wall", "true", "open", "true", "powered", "false");
   private static final Map<String, String> eC = Map.of("facing", "east", "mode", "compare", "powered", "false");
   private static final Map<String, String> eD = Map.of("facing", "north", "mode", "compare", "powered", "false");
   private static final Map<String, String> eE = Map.of("facing", "south", "mode", "compare", "powered", "false");
   private static final Map<String, String> eF = Map.of("facing", "west", "mode", "compare", "powered", "false");
   private static final Map<String, String> eG = Map.of("facing", "east", "mode", "subtract", "powered", "false");
   private static final Map<String, String> eH = Map.of("facing", "north", "mode", "subtract", "powered", "false");
   private static final Map<String, String> eI = Map.of("facing", "south", "mode", "subtract", "powered", "false");
   private static final Map<String, String> eJ = Map.of("facing", "west", "mode", "subtract", "powered", "false");
   private static final Map<String, String> eK = Map.of("powered", "true");
   private static final Map<String, String> eL = Map.of("facing", "east", "in_wall", "false", "open", "false", "powered", "true");
   private static final Map<String, String> eM = Map.of("facing", "north", "in_wall", "false", "open", "false", "powered", "true");
   private static final Map<String, String> eN = Map.of("facing", "south", "in_wall", "false", "open", "false", "powered", "true");
   private static final Map<String, String> eO = Map.of("facing", "west", "in_wall", "false", "open", "false", "powered", "true");
   private static final Map<String, String> eP = Map.of("facing", "east", "in_wall", "false", "open", "true", "powered", "true");
   private static final Map<String, String> eQ = Map.of("facing", "north", "in_wall", "false", "open", "true", "powered", "true");
   private static final Map<String, String> eR = Map.of("facing", "south", "in_wall", "false", "open", "true", "powered", "true");
   private static final Map<String, String> eS = Map.of("facing", "west", "in_wall", "false", "open", "true", "powered", "true");
   private static final Map<String, String> eT = Map.of("facing", "east", "in_wall", "true", "open", "false", "powered", "true");
   private static final Map<String, String> eU = Map.of("facing", "north", "in_wall", "true", "open", "false", "powered", "true");
   private static final Map<String, String> eV = Map.of("facing", "south", "in_wall", "true", "open", "false", "powered", "true");
   private static final Map<String, String> eW = Map.of("facing", "west", "in_wall", "true", "open", "false", "powered", "true");
   private static final Map<String, String> eX = Map.of("facing", "east", "in_wall", "true", "open", "true", "powered", "true");
   private static final Map<String, String> eY = Map.of("facing", "north", "in_wall", "true", "open", "true", "powered", "true");
   private static final Map<String, String> eZ = Map.of("facing", "south", "in_wall", "true", "open", "true", "powered", "true");
   private static final Map<String, String> fa = Map.of("facing", "west", "in_wall", "true", "open", "true", "powered", "true");
   private static final Map<String, String> fb = Map.of("facing", "east", "mode", "compare", "powered", "true");
   private static final Map<String, String> fc = Map.of("facing", "north", "mode", "compare", "powered", "true");
   private static final Map<String, String> fd = Map.of("facing", "south", "mode", "compare", "powered", "true");
   private static final Map<String, String> fe = Map.of("facing", "west", "mode", "compare", "powered", "true");
   private static final Map<String, String> ff = Map.of("facing", "east", "mode", "subtract", "powered", "true");
   private static final Map<String, String> fg = Map.of("facing", "north", "mode", "subtract", "powered", "true");
   private static final Map<String, String> fh = Map.of("facing", "south", "mode", "subtract", "powered", "true");
   private static final Map<String, String> fi = Map.of("facing", "west", "mode", "subtract", "powered", "true");
   private static final Map<String, String> fj = Map.of("power", "0");
   private static final Map<String, String> fk = Map.of("power", "1");
   private static final Map<String, String> fl = Map.of("power", "10");
   private static final Map<String, String> fm = Map.of("power", "11");
   private static final Map<String, String> fn = Map.of("power", "12");
   private static final Map<String, String> fo = Map.of("power", "13");
   private static final Map<String, String> fp = Map.of("power", "14");
   private static final Map<String, String> fq = Map.of("power", "15");
   private static final Map<String, String> fr = Map.of("power", "2");
   private static final Map<String, String> fs = Map.of("power", "3");
   private static final Map<String, String> ft = Map.of("power", "4");
   private static final Map<String, String> fu = Map.of("power", "5");
   private static final Map<String, String> fv = Map.of("power", "6");
   private static final Map<String, String> fw = Map.of("power", "7");
   private static final Map<String, String> fx = Map.of("power", "8");
   private static final Map<String, String> fy = Map.of("power", "9");
   private static final Map<String, String> fz = Map.of("rotation", "0");
   private static final Map<String, String> fA = Map.of("rotation", "1");
   private static final Map<String, String> fB = Map.of("rotation", "10");
   private static final Map<String, String> fC = Map.of("rotation", "11");
   private static final Map<String, String> fD = Map.of("rotation", "12");
   private static final Map<String, String> fE = Map.of("rotation", "13");
   private static final Map<String, String> fF = Map.of("rotation", "14");
   private static final Map<String, String> fG = Map.of("rotation", "15");
   private static final Map<String, String> fH = Map.of("rotation", "2");
   private static final Map<String, String> fI = Map.of("rotation", "3");
   private static final Map<String, String> fJ = Map.of("rotation", "4");
   private static final Map<String, String> fK = Map.of("rotation", "5");
   private static final Map<String, String> fL = Map.of("rotation", "6");
   private static final Map<String, String> fM = Map.of("rotation", "7");
   private static final Map<String, String> fN = Map.of("rotation", "8");
   private static final Map<String, String> fO = Map.of("rotation", "9");
   private static final Map<String, String> fP = Map.of("powered", "false", "shape", "ascending_east");
   private static final Map<String, String> fQ = Map.of("powered", "true", "shape", "ascending_east");
   private static final Map<String, String> fR = Map.of("powered", "false", "shape", "ascending_north");
   private static final Map<String, String> fS = Map.of("powered", "true", "shape", "ascending_north");
   private static final Map<String, String> fT = Map.of("powered", "false", "shape", "ascending_south");
   private static final Map<String, String> fU = Map.of("powered", "true", "shape", "ascending_south");
   private static final Map<String, String> fV = Map.of("powered", "false", "shape", "ascending_west");
   private static final Map<String, String> fW = Map.of("powered", "true", "shape", "ascending_west");
   private static final Map<String, String> fX = Map.of("powered", "false", "shape", "east_west");
   private static final Map<String, String> fY = Map.of("powered", "true", "shape", "east_west");
   private static final Map<String, String> fZ = Map.of("powered", "false", "shape", "north_south");
   private static final Map<String, String> ga = Map.of("powered", "true", "shape", "north_south");
   private static final Map<String, String> gb = Map.of("snowy", "false");
   private static final Map<String, String> gc = Map.of("stage", "0");
   private static final Map<String, String> gd = Map.of("stage", "1");
   private static final Map<String, String> ge = Map.of("facing", "down", "triggered", "false");
   private static final Map<String, String> gf = Map.of("facing", "east", "triggered", "false");
   private static final Map<String, String> gg = Map.of("facing", "north", "triggered", "false");
   private static final Map<String, String> gh = Map.of("facing", "south", "triggered", "false");
   private static final Map<String, String> gi = Map.of("facing", "up", "triggered", "false");
   private static final Map<String, String> gj = Map.of("facing", "west", "triggered", "false");
   private static final Map<String, String> gk = Map.of("facing", "down", "triggered", "true");
   private static final Map<String, String> gl = Map.of("facing", "east", "triggered", "true");
   private static final Map<String, String> gm = Map.of("facing", "north", "triggered", "true");
   private static final Map<String, String> gn = Map.of("facing", "south", "triggered", "true");
   private static final Map<String, String> go = Map.of("facing", "up", "triggered", "true");
   private static final Map<String, String> gp = Map.of("facing", "west", "triggered", "true");
   private static final Map<String, String> gq = Map.of("type", "bottom");
   private static final Map<String, String> gr = Map.of("type", "double");
   private static final Map<String, String> gs = Map.of("type", "top");
   private static final Map<String, String> gt = Map.of("east", "false", "north", "false", "south", "false", "up", "false", "west", "false");
   private static final Map<String, String> gu = Map.of("east", "false", "north", "false", "south", "false", "west", "false");
   private static final Map<String, String> gv = Map.of("east", "true", "north", "false", "south", "false", "west", "false");
   private static final Map<String, String> gw = Map.of("east", "false", "north", "false", "south", "true", "west", "false");
   private static final Map<String, String> gx = Map.of("east", "true", "north", "false", "south", "true", "west", "false");
   private static final Map<String, String> gy = Map.of("east", "false", "north", "true", "south", "false", "west", "false");
   private static final Map<String, String> gz = Map.of("east", "true", "north", "true", "south", "false", "west", "false");
   private static final Map<String, String> gA = Map.of("east", "false", "north", "true", "south", "true", "west", "false");
   private static final Map<String, String> gB = Map.of("east", "true", "north", "true", "south", "true", "west", "false");
   private static final Map<String, String> gC = Map.of("east", "false", "north", "false", "south", "false", "west", "true");
   private static final Map<String, String> gD = Map.of("east", "true", "north", "false", "south", "false", "west", "true");
   private static final Map<String, String> gE = Map.of("east", "false", "north", "false", "south", "true", "west", "true");
   private static final Map<String, String> gF = Map.of("east", "true", "north", "false", "south", "true", "west", "true");
   private static final Map<String, String> gG = Map.of("east", "false", "north", "true", "south", "false", "west", "true");
   private static final Map<String, String> gH = Map.of("east", "true", "north", "true", "south", "false", "west", "true");
   private static final Map<String, String> gI = Map.of("east", "false", "north", "true", "south", "true", "west", "true");
   private static final Map<String, String> gJ = Map.of("east", "true", "north", "true", "south", "true", "west", "true");

   private static Dynamic<?> b(String $$0) {
      return new Dynamic(JavaOps.INSTANCE, Map.of("Name", $$0)).convert(un.a);
   }

   private static Dynamic<?> a(String $$0, Map<String, String> $$1) {
      return new Dynamic(JavaOps.INSTANCE, Map.of("Name", $$0, "Properties", $$1)).convert(un.a);
   }

   private static void a(int $$0, Dynamic<?> $$1, Dynamic<?>... $$2) {
      b[$$0] = $$1;
      int $$3 = $$0 >> 4;
      if (c[$$3] == null) {
         c[$$3] = $$1;
      }

      for (Dynamic<?> $$4 : $$2) {
         String $$5 = $$4.get("Name").asString("");
         e.putIfAbsent($$5, $$0);
         d.put($$4, $$0);
      }
   }

   private static void a() {
      for (int $$0 = 0; $$0 < b.length; $$0++) {
         if (b[$$0] == null) {
            b[$$0] = c[$$0 >> 4];
         }
      }
   }

   public static Dynamic<?> a(Dynamic<?> $$0) {
      int $$1 = d.getInt($$0);
      if ($$1 >= 0 && $$1 < b.length) {
         Dynamic<?> $$2 = b[$$1];
         return $$2 == null ? $$0 : $$2;
      } else {
         return $$0;
      }
   }

   public static String a(String $$0) {
      int $$1 = e.getInt($$0);
      if ($$1 >= 0 && $$1 < b.length) {
         Dynamic<?> $$2 = b[$$1];
         return $$2 == null ? $$0 : $$2.get("Name").asString("");
      } else {
         return $$0;
      }
   }

   public static String a(int $$0) {
      if ($$0 >= 0 && $$0 < b.length) {
         Dynamic<?> $$1 = b[$$0];
         return $$1 == null ? "minecraft:air" : $$1.get("Name").asString("");
      } else {
         return "minecraft:air";
      }
   }

   public static Dynamic<?> b(int $$0) {
      Dynamic<?> $$1 = null;
      if ($$0 >= 0 && $$0 < b.length) {
         $$1 = b[$$0];
      }

      return $$1 == null ? b[0] : $$1;
   }

   private static void b() {
      a(0, b("minecraft:air"), b("minecraft:air"));
      a(16, b("minecraft:stone"), a("minecraft:stone", Map.of("variant", "stone")));
      a(17, b("minecraft:granite"), a("minecraft:stone", Map.of("variant", "granite")));
      a(18, b("minecraft:polished_granite"), a("minecraft:stone", Map.of("variant", "smooth_granite")));
      a(19, b("minecraft:diorite"), a("minecraft:stone", Map.of("variant", "diorite")));
      a(20, b("minecraft:polished_diorite"), a("minecraft:stone", Map.of("variant", "smooth_diorite")));
      a(21, b("minecraft:andesite"), a("minecraft:stone", Map.of("variant", "andesite")));
      a(22, b("minecraft:polished_andesite"), a("minecraft:stone", Map.of("variant", "smooth_andesite")));
      a(32, a("minecraft:grass_block", gb), a("minecraft:grass", gb), a("minecraft:grass", Map.of("snowy", "true")));
      a(
         48,
         b("minecraft:dirt"),
         a("minecraft:dirt", Map.of("snowy", "false", "variant", "dirt")),
         a("minecraft:dirt", Map.of("snowy", "true", "variant", "dirt"))
      );
      a(
         49,
         b("minecraft:coarse_dirt"),
         a("minecraft:dirt", Map.of("snowy", "false", "variant", "coarse_dirt")),
         a("minecraft:dirt", Map.of("snowy", "true", "variant", "coarse_dirt"))
      );
      a(
         50,
         a("minecraft:podzol", gb),
         a("minecraft:dirt", Map.of("snowy", "false", "variant", "podzol")),
         a("minecraft:dirt", Map.of("snowy", "true", "variant", "podzol"))
      );
      a(64, b("minecraft:cobblestone"), b("minecraft:cobblestone"));
      a(80, b("minecraft:oak_planks"), a("minecraft:planks", Map.of("variant", "oak")));
      a(81, b("minecraft:spruce_planks"), a("minecraft:planks", Map.of("variant", "spruce")));
      a(82, b("minecraft:birch_planks"), a("minecraft:planks", Map.of("variant", "birch")));
      a(83, b("minecraft:jungle_planks"), a("minecraft:planks", Map.of("variant", "jungle")));
      a(84, b("minecraft:acacia_planks"), a("minecraft:planks", Map.of("variant", "acacia")));
      a(85, b("minecraft:dark_oak_planks"), a("minecraft:planks", Map.of("variant", "dark_oak")));
      a(96, a("minecraft:oak_sapling", gc), a("minecraft:sapling", Map.of("stage", "0", "type", "oak")));
      a(97, a("minecraft:spruce_sapling", gc), a("minecraft:sapling", Map.of("stage", "0", "type", "spruce")));
      a(98, a("minecraft:birch_sapling", gc), a("minecraft:sapling", Map.of("stage", "0", "type", "birch")));
      a(99, a("minecraft:jungle_sapling", gc), a("minecraft:sapling", Map.of("stage", "0", "type", "jungle")));
      a(100, a("minecraft:acacia_sapling", gc), a("minecraft:sapling", Map.of("stage", "0", "type", "acacia")));
      a(101, a("minecraft:dark_oak_sapling", gc), a("minecraft:sapling", Map.of("stage", "0", "type", "dark_oak")));
      a(104, a("minecraft:oak_sapling", gd), a("minecraft:sapling", Map.of("stage", "1", "type", "oak")));
      a(105, a("minecraft:spruce_sapling", gd), a("minecraft:sapling", Map.of("stage", "1", "type", "spruce")));
      a(106, a("minecraft:birch_sapling", gd), a("minecraft:sapling", Map.of("stage", "1", "type", "birch")));
      a(107, a("minecraft:jungle_sapling", gd), a("minecraft:sapling", Map.of("stage", "1", "type", "jungle")));
      a(108, a("minecraft:acacia_sapling", gd), a("minecraft:sapling", Map.of("stage", "1", "type", "acacia")));
      a(109, a("minecraft:dark_oak_sapling", gd), a("minecraft:sapling", Map.of("stage", "1", "type", "dark_oak")));
      a(112, b("minecraft:bedrock"), b("minecraft:bedrock"));
      a(128, a("minecraft:water", dH), a("minecraft:flowing_water", dH));
      a(129, a("minecraft:water", dI), a("minecraft:flowing_water", dI));
      a(130, a("minecraft:water", dP), a("minecraft:flowing_water", dP));
      a(131, a("minecraft:water", dQ), a("minecraft:flowing_water", dQ));
      a(132, a("minecraft:water", dR), a("minecraft:flowing_water", dR));
      a(133, a("minecraft:water", dS), a("minecraft:flowing_water", dS));
      a(134, a("minecraft:water", dT), a("minecraft:flowing_water", dT));
      a(135, a("minecraft:water", dU), a("minecraft:flowing_water", dU));
      a(136, a("minecraft:water", dV), a("minecraft:flowing_water", dV));
      a(137, a("minecraft:water", dW), a("minecraft:flowing_water", dW));
      a(138, a("minecraft:water", dJ), a("minecraft:flowing_water", dJ));
      a(139, a("minecraft:water", dK), a("minecraft:flowing_water", dK));
      a(140, a("minecraft:water", dL), a("minecraft:flowing_water", dL));
      a(141, a("minecraft:water", dM), a("minecraft:flowing_water", dM));
      a(142, a("minecraft:water", dN), a("minecraft:flowing_water", dN));
      a(143, a("minecraft:water", dO), a("minecraft:flowing_water", dO));
      a(144, a("minecraft:water", dH), a("minecraft:water", dH));
      a(145, a("minecraft:water", dI), a("minecraft:water", dI));
      a(146, a("minecraft:water", dP), a("minecraft:water", dP));
      a(147, a("minecraft:water", dQ), a("minecraft:water", dQ));
      a(148, a("minecraft:water", dR), a("minecraft:water", dR));
      a(149, a("minecraft:water", dS), a("minecraft:water", dS));
      a(150, a("minecraft:water", dT), a("minecraft:water", dT));
      a(151, a("minecraft:water", dU), a("minecraft:water", dU));
      a(152, a("minecraft:water", dV), a("minecraft:water", dV));
      a(153, a("minecraft:water", dW), a("minecraft:water", dW));
      a(154, a("minecraft:water", dJ), a("minecraft:water", dJ));
      a(155, a("minecraft:water", dK), a("minecraft:water", dK));
      a(156, a("minecraft:water", dL), a("minecraft:water", dL));
      a(157, a("minecraft:water", dM), a("minecraft:water", dM));
      a(158, a("minecraft:water", dN), a("minecraft:water", dN));
      a(159, a("minecraft:water", dO), a("minecraft:water", dO));
      a(160, a("minecraft:lava", dH), a("minecraft:flowing_lava", dH));
      a(161, a("minecraft:lava", dI), a("minecraft:flowing_lava", dI));
      a(162, a("minecraft:lava", dP), a("minecraft:flowing_lava", dP));
      a(163, a("minecraft:lava", dQ), a("minecraft:flowing_lava", dQ));
      a(164, a("minecraft:lava", dR), a("minecraft:flowing_lava", dR));
      a(165, a("minecraft:lava", dS), a("minecraft:flowing_lava", dS));
      a(166, a("minecraft:lava", dT), a("minecraft:flowing_lava", dT));
      a(167, a("minecraft:lava", dU), a("minecraft:flowing_lava", dU));
      a(168, a("minecraft:lava", dV), a("minecraft:flowing_lava", dV));
      a(169, a("minecraft:lava", dW), a("minecraft:flowing_lava", dW));
      a(170, a("minecraft:lava", dJ), a("minecraft:flowing_lava", dJ));
      a(171, a("minecraft:lava", dK), a("minecraft:flowing_lava", dK));
      a(172, a("minecraft:lava", dL), a("minecraft:flowing_lava", dL));
      a(173, a("minecraft:lava", dM), a("minecraft:flowing_lava", dM));
      a(174, a("minecraft:lava", dN), a("minecraft:flowing_lava", dN));
      a(175, a("minecraft:lava", dO), a("minecraft:flowing_lava", dO));
      a(176, a("minecraft:lava", dH), a("minecraft:lava", dH));
      a(177, a("minecraft:lava", dI), a("minecraft:lava", dI));
      a(178, a("minecraft:lava", dP), a("minecraft:lava", dP));
      a(179, a("minecraft:lava", dQ), a("minecraft:lava", dQ));
      a(180, a("minecraft:lava", dR), a("minecraft:lava", dR));
      a(181, a("minecraft:lava", dS), a("minecraft:lava", dS));
      a(182, a("minecraft:lava", dT), a("minecraft:lava", dT));
      a(183, a("minecraft:lava", dU), a("minecraft:lava", dU));
      a(184, a("minecraft:lava", dV), a("minecraft:lava", dV));
      a(185, a("minecraft:lava", dW), a("minecraft:lava", dW));
      a(186, a("minecraft:lava", dJ), a("minecraft:lava", dJ));
      a(187, a("minecraft:lava", dK), a("minecraft:lava", dK));
      a(188, a("minecraft:lava", dL), a("minecraft:lava", dL));
      a(189, a("minecraft:lava", dM), a("minecraft:lava", dM));
      a(190, a("minecraft:lava", dN), a("minecraft:lava", dN));
      a(191, a("minecraft:lava", dO), a("minecraft:lava", dO));
      a(192, b("minecraft:sand"), a("minecraft:sand", Map.of("variant", "sand")));
      a(193, b("minecraft:red_sand"), a("minecraft:sand", Map.of("variant", "red_sand")));
      a(208, b("minecraft:gravel"), b("minecraft:gravel"));
      a(224, b("minecraft:gold_ore"), b("minecraft:gold_ore"));
      a(240, b("minecraft:iron_ore"), b("minecraft:iron_ore"));
   }

   private static void c() {
      a(256, b("minecraft:coal_ore"), b("minecraft:coal_ore"));
      a(272, a("minecraft:oak_log", K), a("minecraft:log", Map.of("axis", "y", "variant", "oak")));
      a(273, a("minecraft:spruce_log", K), a("minecraft:log", Map.of("axis", "y", "variant", "spruce")));
      a(274, a("minecraft:birch_log", K), a("minecraft:log", Map.of("axis", "y", "variant", "birch")));
      a(275, a("minecraft:jungle_log", K), a("minecraft:log", Map.of("axis", "y", "variant", "jungle")));
      a(276, a("minecraft:oak_log", J), a("minecraft:log", Map.of("axis", "x", "variant", "oak")));
      a(277, a("minecraft:spruce_log", J), a("minecraft:log", Map.of("axis", "x", "variant", "spruce")));
      a(278, a("minecraft:birch_log", J), a("minecraft:log", Map.of("axis", "x", "variant", "birch")));
      a(279, a("minecraft:jungle_log", J), a("minecraft:log", Map.of("axis", "x", "variant", "jungle")));
      a(280, a("minecraft:oak_log", L), a("minecraft:log", Map.of("axis", "z", "variant", "oak")));
      a(281, a("minecraft:spruce_log", L), a("minecraft:log", Map.of("axis", "z", "variant", "spruce")));
      a(282, a("minecraft:birch_log", L), a("minecraft:log", Map.of("axis", "z", "variant", "birch")));
      a(283, a("minecraft:jungle_log", L), a("minecraft:log", Map.of("axis", "z", "variant", "jungle")));
      a(284, b("minecraft:oak_bark"), a("minecraft:log", Map.of("axis", "none", "variant", "oak")));
      a(285, b("minecraft:spruce_bark"), a("minecraft:log", Map.of("axis", "none", "variant", "spruce")));
      a(286, b("minecraft:birch_bark"), a("minecraft:log", Map.of("axis", "none", "variant", "birch")));
      a(287, b("minecraft:jungle_bark"), a("minecraft:log", Map.of("axis", "none", "variant", "jungle")));
      a(288, a("minecraft:oak_leaves", N), a("minecraft:leaves", Map.of("check_decay", "false", "decayable", "true", "variant", "oak")));
      a(289, a("minecraft:spruce_leaves", N), a("minecraft:leaves", Map.of("check_decay", "false", "decayable", "true", "variant", "spruce")));
      a(290, a("minecraft:birch_leaves", N), a("minecraft:leaves", Map.of("check_decay", "false", "decayable", "true", "variant", "birch")));
      a(291, a("minecraft:jungle_leaves", N), a("minecraft:leaves", Map.of("check_decay", "false", "decayable", "true", "variant", "jungle")));
      a(292, a("minecraft:oak_leaves", M), a("minecraft:leaves", Map.of("check_decay", "false", "decayable", "false", "variant", "oak")));
      a(293, a("minecraft:spruce_leaves", M), a("minecraft:leaves", Map.of("check_decay", "false", "decayable", "false", "variant", "spruce")));
      a(294, a("minecraft:birch_leaves", M), a("minecraft:leaves", Map.of("check_decay", "false", "decayable", "false", "variant", "birch")));
      a(295, a("minecraft:jungle_leaves", M), a("minecraft:leaves", Map.of("check_decay", "false", "decayable", "false", "variant", "jungle")));
      a(296, a("minecraft:oak_leaves", P), a("minecraft:leaves", Map.of("check_decay", "true", "decayable", "true", "variant", "oak")));
      a(297, a("minecraft:spruce_leaves", P), a("minecraft:leaves", Map.of("check_decay", "true", "decayable", "true", "variant", "spruce")));
      a(298, a("minecraft:birch_leaves", P), a("minecraft:leaves", Map.of("check_decay", "true", "decayable", "true", "variant", "birch")));
      a(299, a("minecraft:jungle_leaves", P), a("minecraft:leaves", Map.of("check_decay", "true", "decayable", "true", "variant", "jungle")));
      a(300, a("minecraft:oak_leaves", O), a("minecraft:leaves", Map.of("check_decay", "true", "decayable", "false", "variant", "oak")));
      a(301, a("minecraft:spruce_leaves", O), a("minecraft:leaves", Map.of("check_decay", "true", "decayable", "false", "variant", "spruce")));
      a(302, a("minecraft:birch_leaves", O), a("minecraft:leaves", Map.of("check_decay", "true", "decayable", "false", "variant", "birch")));
      a(303, a("minecraft:jungle_leaves", O), a("minecraft:leaves", Map.of("check_decay", "true", "decayable", "false", "variant", "jungle")));
      a(304, b("minecraft:sponge"), a("minecraft:sponge", Map.of("wet", "false")));
      a(305, b("minecraft:wet_sponge"), a("minecraft:sponge", Map.of("wet", "true")));
      a(320, b("minecraft:glass"), b("minecraft:glass"));
      a(336, b("minecraft:lapis_ore"), b("minecraft:lapis_ore"));
      a(352, b("minecraft:lapis_block"), b("minecraft:lapis_block"));
      a(368, a("minecraft:dispenser", ge), a("minecraft:dispenser", ge));
      a(369, a("minecraft:dispenser", gi), a("minecraft:dispenser", gi));
      a(370, a("minecraft:dispenser", gg), a("minecraft:dispenser", gg));
      a(371, a("minecraft:dispenser", gh), a("minecraft:dispenser", gh));
      a(372, a("minecraft:dispenser", gj), a("minecraft:dispenser", gj));
      a(373, a("minecraft:dispenser", gf), a("minecraft:dispenser", gf));
      a(376, a("minecraft:dispenser", gk), a("minecraft:dispenser", gk));
      a(377, a("minecraft:dispenser", go), a("minecraft:dispenser", go));
      a(378, a("minecraft:dispenser", gm), a("minecraft:dispenser", gm));
      a(379, a("minecraft:dispenser", gn), a("minecraft:dispenser", gn));
      a(380, a("minecraft:dispenser", gp), a("minecraft:dispenser", gp));
      a(381, a("minecraft:dispenser", gl), a("minecraft:dispenser", gl));
      a(384, b("minecraft:sandstone"), a("minecraft:sandstone", Map.of("type", "sandstone")));
      a(385, b("minecraft:chiseled_sandstone"), a("minecraft:sandstone", Map.of("type", "chiseled_sandstone")));
      a(386, b("minecraft:cut_sandstone"), a("minecraft:sandstone", Map.of("type", "smooth_sandstone")));
      a(400, b("minecraft:note_block"), b("minecraft:noteblock"));
      a(
         416,
         a("minecraft:red_bed", Map.of("facing", "south", "occupied", "false", "part", "foot")),
         a("minecraft:bed", Map.of("facing", "south", "occupied", "false", "part", "foot")),
         a("minecraft:bed", Map.of("facing", "south", "occupied", "true", "part", "foot"))
      );
      a(
         417,
         a("minecraft:red_bed", Map.of("facing", "west", "occupied", "false", "part", "foot")),
         a("minecraft:bed", Map.of("facing", "west", "occupied", "false", "part", "foot")),
         a("minecraft:bed", Map.of("facing", "west", "occupied", "true", "part", "foot"))
      );
      a(
         418,
         a("minecraft:red_bed", Map.of("facing", "north", "occupied", "false", "part", "foot")),
         a("minecraft:bed", Map.of("facing", "north", "occupied", "false", "part", "foot")),
         a("minecraft:bed", Map.of("facing", "north", "occupied", "true", "part", "foot"))
      );
      a(
         419,
         a("minecraft:red_bed", Map.of("facing", "east", "occupied", "false", "part", "foot")),
         a("minecraft:bed", Map.of("facing", "east", "occupied", "false", "part", "foot")),
         a("minecraft:bed", Map.of("facing", "east", "occupied", "true", "part", "foot"))
      );
      a(
         424,
         a("minecraft:red_bed", Map.of("facing", "south", "occupied", "false", "part", "head")),
         a("minecraft:bed", Map.of("facing", "south", "occupied", "false", "part", "head"))
      );
      a(
         425,
         a("minecraft:red_bed", Map.of("facing", "west", "occupied", "false", "part", "head")),
         a("minecraft:bed", Map.of("facing", "west", "occupied", "false", "part", "head"))
      );
      a(
         426,
         a("minecraft:red_bed", Map.of("facing", "north", "occupied", "false", "part", "head")),
         a("minecraft:bed", Map.of("facing", "north", "occupied", "false", "part", "head"))
      );
      a(
         427,
         a("minecraft:red_bed", Map.of("facing", "east", "occupied", "false", "part", "head")),
         a("minecraft:bed", Map.of("facing", "east", "occupied", "false", "part", "head"))
      );
      a(
         428,
         a("minecraft:red_bed", Map.of("facing", "south", "occupied", "true", "part", "head")),
         a("minecraft:bed", Map.of("facing", "south", "occupied", "true", "part", "head"))
      );
      a(
         429,
         a("minecraft:red_bed", Map.of("facing", "west", "occupied", "true", "part", "head")),
         a("minecraft:bed", Map.of("facing", "west", "occupied", "true", "part", "head"))
      );
      a(
         430,
         a("minecraft:red_bed", Map.of("facing", "north", "occupied", "true", "part", "head")),
         a("minecraft:bed", Map.of("facing", "north", "occupied", "true", "part", "head"))
      );
      a(
         431,
         a("minecraft:red_bed", Map.of("facing", "east", "occupied", "true", "part", "head")),
         a("minecraft:bed", Map.of("facing", "east", "occupied", "true", "part", "head"))
      );
      a(432, a("minecraft:powered_rail", fZ), a("minecraft:golden_rail", fZ));
      a(433, a("minecraft:powered_rail", fX), a("minecraft:golden_rail", fX));
      a(434, a("minecraft:powered_rail", fP), a("minecraft:golden_rail", fP));
      a(435, a("minecraft:powered_rail", fV), a("minecraft:golden_rail", fV));
      a(436, a("minecraft:powered_rail", fR), a("minecraft:golden_rail", fR));
      a(437, a("minecraft:powered_rail", fT), a("minecraft:golden_rail", fT));
      a(440, a("minecraft:powered_rail", ga), a("minecraft:golden_rail", ga));
      a(441, a("minecraft:powered_rail", fY), a("minecraft:golden_rail", fY));
      a(442, a("minecraft:powered_rail", fQ), a("minecraft:golden_rail", fQ));
      a(443, a("minecraft:powered_rail", fW), a("minecraft:golden_rail", fW));
      a(444, a("minecraft:powered_rail", fS), a("minecraft:golden_rail", fS));
      a(445, a("minecraft:powered_rail", fU), a("minecraft:golden_rail", fU));
      a(448, a("minecraft:detector_rail", fZ), a("minecraft:detector_rail", fZ));
      a(449, a("minecraft:detector_rail", fX), a("minecraft:detector_rail", fX));
      a(450, a("minecraft:detector_rail", fP), a("minecraft:detector_rail", fP));
      a(451, a("minecraft:detector_rail", fV), a("minecraft:detector_rail", fV));
      a(452, a("minecraft:detector_rail", fR), a("minecraft:detector_rail", fR));
      a(453, a("minecraft:detector_rail", fT), a("minecraft:detector_rail", fT));
      a(456, a("minecraft:detector_rail", ga), a("minecraft:detector_rail", ga));
      a(457, a("minecraft:detector_rail", fY), a("minecraft:detector_rail", fY));
      a(458, a("minecraft:detector_rail", fQ), a("minecraft:detector_rail", fQ));
      a(459, a("minecraft:detector_rail", fW), a("minecraft:detector_rail", fW));
      a(460, a("minecraft:detector_rail", fS), a("minecraft:detector_rail", fS));
      a(461, a("minecraft:detector_rail", fU), a("minecraft:detector_rail", fU));
      a(464, a("minecraft:sticky_piston", aC), a("minecraft:sticky_piston", aC));
      a(465, a("minecraft:sticky_piston", ca), a("minecraft:sticky_piston", ca));
      a(466, a("minecraft:sticky_piston", bg), a("minecraft:sticky_piston", bg));
      a(467, a("minecraft:sticky_piston", bD), a("minecraft:sticky_piston", bD));
      a(468, a("minecraft:sticky_piston", ch), a("minecraft:sticky_piston", ch));
      a(469, a("minecraft:sticky_piston", aJ), a("minecraft:sticky_piston", aJ));
      a(472, a("minecraft:sticky_piston", aD), a("minecraft:sticky_piston", aD));
      a(473, a("minecraft:sticky_piston", cb), a("minecraft:sticky_piston", cb));
      a(474, a("minecraft:sticky_piston", bh), a("minecraft:sticky_piston", bh));
      a(475, a("minecraft:sticky_piston", bE), a("minecraft:sticky_piston", bE));
      a(476, a("minecraft:sticky_piston", ci), a("minecraft:sticky_piston", ci));
      a(477, a("minecraft:sticky_piston", aK), a("minecraft:sticky_piston", aK));
      a(480, b("minecraft:cobweb"), b("minecraft:web"));
      a(496, b("minecraft:dead_bush"), a("minecraft:tallgrass", Map.of("type", "dead_bush")));
      a(497, b("minecraft:grass"), a("minecraft:tallgrass", Map.of("type", "tall_grass")));
      a(498, b("minecraft:fern"), a("minecraft:tallgrass", Map.of("type", "fern")));
   }

   private static void d() {
      a(512, b("minecraft:dead_bush"), b("minecraft:deadbush"));
      a(528, a("minecraft:piston", aC), a("minecraft:piston", aC));
      a(529, a("minecraft:piston", ca), a("minecraft:piston", ca));
      a(530, a("minecraft:piston", bg), a("minecraft:piston", bg));
      a(531, a("minecraft:piston", bD), a("minecraft:piston", bD));
      a(532, a("minecraft:piston", ch), a("minecraft:piston", ch));
      a(533, a("minecraft:piston", aJ), a("minecraft:piston", aJ));
      a(536, a("minecraft:piston", aD), a("minecraft:piston", aD));
      a(537, a("minecraft:piston", cb), a("minecraft:piston", cb));
      a(538, a("minecraft:piston", bh), a("minecraft:piston", bh));
      a(539, a("minecraft:piston", bE), a("minecraft:piston", bE));
      a(540, a("minecraft:piston", ci), a("minecraft:piston", ci));
      a(541, a("minecraft:piston", aK), a("minecraft:piston", aK));
      a(
         544,
         a("minecraft:piston_head", Map.of("facing", "down", "short", "false", "type", "normal")),
         a("minecraft:piston_head", Map.of("facing", "down", "short", "false", "type", "normal")),
         a("minecraft:piston_head", Map.of("facing", "down", "short", "true", "type", "normal"))
      );
      a(
         545,
         a("minecraft:piston_head", Map.of("facing", "up", "short", "false", "type", "normal")),
         a("minecraft:piston_head", Map.of("facing", "up", "short", "false", "type", "normal")),
         a("minecraft:piston_head", Map.of("facing", "up", "short", "true", "type", "normal"))
      );
      a(
         546,
         a("minecraft:piston_head", Map.of("facing", "north", "short", "false", "type", "normal")),
         a("minecraft:piston_head", Map.of("facing", "north", "short", "false", "type", "normal")),
         a("minecraft:piston_head", Map.of("facing", "north", "short", "true", "type", "normal"))
      );
      a(
         547,
         a("minecraft:piston_head", Map.of("facing", "south", "short", "false", "type", "normal")),
         a("minecraft:piston_head", Map.of("facing", "south", "short", "false", "type", "normal")),
         a("minecraft:piston_head", Map.of("facing", "south", "short", "true", "type", "normal"))
      );
      a(
         548,
         a("minecraft:piston_head", Map.of("facing", "west", "short", "false", "type", "normal")),
         a("minecraft:piston_head", Map.of("facing", "west", "short", "false", "type", "normal")),
         a("minecraft:piston_head", Map.of("facing", "west", "short", "true", "type", "normal"))
      );
      a(
         549,
         a("minecraft:piston_head", Map.of("facing", "east", "short", "false", "type", "normal")),
         a("minecraft:piston_head", Map.of("facing", "east", "short", "false", "type", "normal")),
         a("minecraft:piston_head", Map.of("facing", "east", "short", "true", "type", "normal"))
      );
      a(
         552,
         a("minecraft:piston_head", Map.of("facing", "down", "short", "false", "type", "sticky")),
         a("minecraft:piston_head", Map.of("facing", "down", "short", "false", "type", "sticky")),
         a("minecraft:piston_head", Map.of("facing", "down", "short", "true", "type", "sticky"))
      );
      a(
         553,
         a("minecraft:piston_head", Map.of("facing", "up", "short", "false", "type", "sticky")),
         a("minecraft:piston_head", Map.of("facing", "up", "short", "false", "type", "sticky")),
         a("minecraft:piston_head", Map.of("facing", "up", "short", "true", "type", "sticky"))
      );
      a(
         554,
         a("minecraft:piston_head", Map.of("facing", "north", "short", "false", "type", "sticky")),
         a("minecraft:piston_head", Map.of("facing", "north", "short", "false", "type", "sticky")),
         a("minecraft:piston_head", Map.of("facing", "north", "short", "true", "type", "sticky"))
      );
      a(
         555,
         a("minecraft:piston_head", Map.of("facing", "south", "short", "false", "type", "sticky")),
         a("minecraft:piston_head", Map.of("facing", "south", "short", "false", "type", "sticky")),
         a("minecraft:piston_head", Map.of("facing", "south", "short", "true", "type", "sticky"))
      );
      a(
         556,
         a("minecraft:piston_head", Map.of("facing", "west", "short", "false", "type", "sticky")),
         a("minecraft:piston_head", Map.of("facing", "west", "short", "false", "type", "sticky")),
         a("minecraft:piston_head", Map.of("facing", "west", "short", "true", "type", "sticky"))
      );
      a(
         557,
         a("minecraft:piston_head", Map.of("facing", "east", "short", "false", "type", "sticky")),
         a("minecraft:piston_head", Map.of("facing", "east", "short", "false", "type", "sticky")),
         a("minecraft:piston_head", Map.of("facing", "east", "short", "true", "type", "sticky"))
      );
      a(560, b("minecraft:white_wool"), a("minecraft:wool", ae));
      a(561, b("minecraft:orange_wool"), a("minecraft:wool", Z));
      a(562, b("minecraft:magenta_wool"), a("minecraft:wool", Y));
      a(563, b("minecraft:light_blue_wool"), a("minecraft:wool", W));
      a(564, b("minecraft:yellow_wool"), a("minecraft:wool", af));
      a(565, b("minecraft:lime_wool"), a("minecraft:wool", X));
      a(566, b("minecraft:pink_wool"), a("minecraft:wool", aa));
      a(567, b("minecraft:gray_wool"), a("minecraft:wool", U));
      a(568, b("minecraft:light_gray_wool"), a("minecraft:wool", ad));
      a(569, b("minecraft:cyan_wool"), a("minecraft:wool", T));
      a(570, b("minecraft:purple_wool"), a("minecraft:wool", ab));
      a(571, b("minecraft:blue_wool"), a("minecraft:wool", R));
      a(572, b("minecraft:brown_wool"), a("minecraft:wool", S));
      a(573, b("minecraft:green_wool"), a("minecraft:wool", V));
      a(574, b("minecraft:red_wool"), a("minecraft:wool", ac));
      a(575, b("minecraft:black_wool"), a("minecraft:wool", Q));
      a(
         576,
         a("minecraft:moving_piston", Map.of("facing", "down", "type", "normal")),
         a("minecraft:piston_extension", Map.of("facing", "down", "type", "normal"))
      );
      a(577, a("minecraft:moving_piston", Map.of("facing", "up", "type", "normal")), a("minecraft:piston_extension", Map.of("facing", "up", "type", "normal")));
      a(
         578,
         a("minecraft:moving_piston", Map.of("facing", "north", "type", "normal")),
         a("minecraft:piston_extension", Map.of("facing", "north", "type", "normal"))
      );
      a(
         579,
         a("minecraft:moving_piston", Map.of("facing", "south", "type", "normal")),
         a("minecraft:piston_extension", Map.of("facing", "south", "type", "normal"))
      );
      a(
         580,
         a("minecraft:moving_piston", Map.of("facing", "west", "type", "normal")),
         a("minecraft:piston_extension", Map.of("facing", "west", "type", "normal"))
      );
      a(
         581,
         a("minecraft:moving_piston", Map.of("facing", "east", "type", "normal")),
         a("minecraft:piston_extension", Map.of("facing", "east", "type", "normal"))
      );
      a(
         584,
         a("minecraft:moving_piston", Map.of("facing", "down", "type", "sticky")),
         a("minecraft:piston_extension", Map.of("facing", "down", "type", "sticky"))
      );
      a(585, a("minecraft:moving_piston", Map.of("facing", "up", "type", "sticky")), a("minecraft:piston_extension", Map.of("facing", "up", "type", "sticky")));
      a(
         586,
         a("minecraft:moving_piston", Map.of("facing", "north", "type", "sticky")),
         a("minecraft:piston_extension", Map.of("facing", "north", "type", "sticky"))
      );
      a(
         587,
         a("minecraft:moving_piston", Map.of("facing", "south", "type", "sticky")),
         a("minecraft:piston_extension", Map.of("facing", "south", "type", "sticky"))
      );
      a(
         588,
         a("minecraft:moving_piston", Map.of("facing", "west", "type", "sticky")),
         a("minecraft:piston_extension", Map.of("facing", "west", "type", "sticky"))
      );
      a(
         589,
         a("minecraft:moving_piston", Map.of("facing", "east", "type", "sticky")),
         a("minecraft:piston_extension", Map.of("facing", "east", "type", "sticky"))
      );
      a(592, b("minecraft:dandelion"), a("minecraft:yellow_flower", Map.of("type", "dandelion")));
      a(608, b("minecraft:poppy"), a("minecraft:red_flower", Map.of("type", "poppy")));
      a(609, b("minecraft:blue_orchid"), a("minecraft:red_flower", Map.of("type", "blue_orchid")));
      a(610, b("minecraft:allium"), a("minecraft:red_flower", Map.of("type", "allium")));
      a(611, b("minecraft:azure_bluet"), a("minecraft:red_flower", Map.of("type", "houstonia")));
      a(612, b("minecraft:red_tulip"), a("minecraft:red_flower", Map.of("type", "red_tulip")));
      a(613, b("minecraft:orange_tulip"), a("minecraft:red_flower", Map.of("type", "orange_tulip")));
      a(614, b("minecraft:white_tulip"), a("minecraft:red_flower", Map.of("type", "white_tulip")));
      a(615, b("minecraft:pink_tulip"), a("minecraft:red_flower", Map.of("type", "pink_tulip")));
      a(616, b("minecraft:oxeye_daisy"), a("minecraft:red_flower", Map.of("type", "oxeye_daisy")));
      a(624, b("minecraft:brown_mushroom"), b("minecraft:brown_mushroom"));
      a(640, b("minecraft:red_mushroom"), b("minecraft:red_mushroom"));
      a(656, b("minecraft:gold_block"), b("minecraft:gold_block"));
      a(672, b("minecraft:iron_block"), b("minecraft:iron_block"));
      a(688, a("minecraft:stone_slab", gr), a("minecraft:double_stone_slab", Map.of("seamless", "false", "variant", "stone")));
      a(689, a("minecraft:sandstone_slab", gr), a("minecraft:double_stone_slab", Map.of("seamless", "false", "variant", "sandstone")));
      a(690, a("minecraft:petrified_oak_slab", gr), a("minecraft:double_stone_slab", Map.of("seamless", "false", "variant", "wood_old")));
      a(691, a("minecraft:cobblestone_slab", gr), a("minecraft:double_stone_slab", Map.of("seamless", "false", "variant", "cobblestone")));
      a(692, a("minecraft:brick_slab", gr), a("minecraft:double_stone_slab", Map.of("seamless", "false", "variant", "brick")));
      a(693, a("minecraft:stone_brick_slab", gr), a("minecraft:double_stone_slab", Map.of("seamless", "false", "variant", "stone_brick")));
      a(694, a("minecraft:nether_brick_slab", gr), a("minecraft:double_stone_slab", Map.of("seamless", "false", "variant", "nether_brick")));
      a(695, a("minecraft:quartz_slab", gr), a("minecraft:double_stone_slab", Map.of("seamless", "false", "variant", "quartz")));
      a(696, b("minecraft:smooth_stone"), a("minecraft:double_stone_slab", Map.of("seamless", "true", "variant", "stone")));
      a(697, b("minecraft:smooth_sandstone"), a("minecraft:double_stone_slab", Map.of("seamless", "true", "variant", "sandstone")));
      a(698, a("minecraft:petrified_oak_slab", gr), a("minecraft:double_stone_slab", Map.of("seamless", "true", "variant", "wood_old")));
      a(699, a("minecraft:cobblestone_slab", gr), a("minecraft:double_stone_slab", Map.of("seamless", "true", "variant", "cobblestone")));
      a(700, a("minecraft:brick_slab", gr), a("minecraft:double_stone_slab", Map.of("seamless", "true", "variant", "brick")));
      a(701, a("minecraft:stone_brick_slab", gr), a("minecraft:double_stone_slab", Map.of("seamless", "true", "variant", "stone_brick")));
      a(702, a("minecraft:nether_brick_slab", gr), a("minecraft:double_stone_slab", Map.of("seamless", "true", "variant", "nether_brick")));
      a(703, b("minecraft:smooth_quartz"), a("minecraft:double_stone_slab", Map.of("seamless", "true", "variant", "quartz")));
      a(704, a("minecraft:stone_slab", gq), a("minecraft:stone_slab", Map.of("half", "bottom", "variant", "stone")));
      a(705, a("minecraft:sandstone_slab", gq), a("minecraft:stone_slab", Map.of("half", "bottom", "variant", "sandstone")));
      a(706, a("minecraft:petrified_oak_slab", gq), a("minecraft:stone_slab", Map.of("half", "bottom", "variant", "wood_old")));
      a(707, a("minecraft:cobblestone_slab", gq), a("minecraft:stone_slab", Map.of("half", "bottom", "variant", "cobblestone")));
      a(708, a("minecraft:brick_slab", gq), a("minecraft:stone_slab", Map.of("half", "bottom", "variant", "brick")));
      a(709, a("minecraft:stone_brick_slab", gq), a("minecraft:stone_slab", Map.of("half", "bottom", "variant", "stone_brick")));
      a(710, a("minecraft:nether_brick_slab", gq), a("minecraft:stone_slab", Map.of("half", "bottom", "variant", "nether_brick")));
      a(711, a("minecraft:quartz_slab", gq), a("minecraft:stone_slab", Map.of("half", "bottom", "variant", "quartz")));
      a(712, a("minecraft:stone_slab", gs), a("minecraft:stone_slab", Map.of("half", "top", "variant", "stone")));
      a(713, a("minecraft:sandstone_slab", gs), a("minecraft:stone_slab", Map.of("half", "top", "variant", "sandstone")));
      a(714, a("minecraft:petrified_oak_slab", gs), a("minecraft:stone_slab", Map.of("half", "top", "variant", "wood_old")));
      a(715, a("minecraft:cobblestone_slab", gs), a("minecraft:stone_slab", Map.of("half", "top", "variant", "cobblestone")));
      a(716, a("minecraft:brick_slab", gs), a("minecraft:stone_slab", Map.of("half", "top", "variant", "brick")));
      a(717, a("minecraft:stone_brick_slab", gs), a("minecraft:stone_slab", Map.of("half", "top", "variant", "stone_brick")));
      a(718, a("minecraft:nether_brick_slab", gs), a("minecraft:stone_slab", Map.of("half", "top", "variant", "nether_brick")));
      a(719, a("minecraft:quartz_slab", gs), a("minecraft:stone_slab", Map.of("half", "top", "variant", "quartz")));
      a(720, b("minecraft:bricks"), b("minecraft:brick_block"));
      a(736, a("minecraft:tnt", Map.of("unstable", "false")), a("minecraft:tnt", Map.of("explode", "false")));
      a(737, a("minecraft:tnt", Map.of("unstable", "true")), a("minecraft:tnt", Map.of("explode", "true")));
      a(752, b("minecraft:bookshelf"), b("minecraft:bookshelf"));
   }

   private static void e() {
      a(768, b("minecraft:mossy_cobblestone"), b("minecraft:mossy_cobblestone"));
      a(784, b("minecraft:obsidian"), b("minecraft:obsidian"));
      a(801, a("minecraft:wall_torch", aG), a("minecraft:torch", aG));
      a(802, a("minecraft:wall_torch", ce), a("minecraft:torch", ce));
      a(803, a("minecraft:wall_torch", bA), a("minecraft:torch", bA));
      a(804, a("minecraft:wall_torch", bd), a("minecraft:torch", bd));
      a(805, b("minecraft:torch"), a("minecraft:torch", bX));
      a(
         816,
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "0", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "0", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "0", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "0", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "0", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "0", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "0", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "0", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "0", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(
         817,
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "1", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "1", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "1", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "1", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "1", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "1", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "1", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "1", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "1", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(
         818,
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "2", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "2", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "2", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "2", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "2", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "2", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "2", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "2", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "2", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(
         819,
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "3", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "3", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "3", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "3", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "3", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "3", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "3", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "3", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "3", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(
         820,
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "4", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "4", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "4", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "4", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "4", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "4", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "4", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "4", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "4", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(
         821,
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "5", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "5", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "5", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "5", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "5", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "5", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "5", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "5", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "5", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(
         822,
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "6", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "6", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "6", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "6", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "6", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "6", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "6", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "6", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "6", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(
         823,
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "7", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "7", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "7", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "7", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "7", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "7", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "7", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "7", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "7", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(
         824,
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "8", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "8", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "8", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "8", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "8", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "8", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "8", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "8", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "8", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(
         825,
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "9", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "9", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "9", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "9", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "9", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "9", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "9", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "9", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "9", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(
         826,
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "10", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "10", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "10", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "10", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "10", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "10", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "10", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "10", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "10", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(
         827,
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "11", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "11", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "11", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "11", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "11", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "11", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "11", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "11", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "11", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(
         828,
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "12", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "12", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "12", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "12", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "12", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "12", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "12", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "12", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "12", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(
         829,
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "13", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "13", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "13", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "13", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "13", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "13", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "13", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "13", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "13", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(
         830,
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "14", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "14", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "14", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "14", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "14", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "14", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "14", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "14", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "14", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(
         831,
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "15", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "15", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "15", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "15", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "15", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "15", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:fire", Map.of("age", "15", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:fire", Map.of("age", "15", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:fire", Map.of("age", "15", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
   }

   private static void f() {
      a(832, b("minecraft:mob_spawner"), b("minecraft:mob_spawner"));
      a(
         848,
         a("minecraft:oak_stairs", cZ),
         a("minecraft:oak_stairs", cJ),
         a("minecraft:oak_stairs", cN),
         a("minecraft:oak_stairs", cR),
         a("minecraft:oak_stairs", cV),
         a("minecraft:oak_stairs", cZ)
      );
      a(
         849,
         a("minecraft:oak_stairs", dc),
         a("minecraft:oak_stairs", cM),
         a("minecraft:oak_stairs", cQ),
         a("minecraft:oak_stairs", cU),
         a("minecraft:oak_stairs", cY),
         a("minecraft:oak_stairs", dc)
      );
      a(
         850,
         a("minecraft:oak_stairs", db),
         a("minecraft:oak_stairs", cL),
         a("minecraft:oak_stairs", cP),
         a("minecraft:oak_stairs", cT),
         a("minecraft:oak_stairs", cX),
         a("minecraft:oak_stairs", db)
      );
      a(
         851,
         a("minecraft:oak_stairs", da),
         a("minecraft:oak_stairs", cK),
         a("minecraft:oak_stairs", cO),
         a("minecraft:oak_stairs", cS),
         a("minecraft:oak_stairs", cW),
         a("minecraft:oak_stairs", da)
      );
      a(
         852,
         a("minecraft:oak_stairs", dC),
         a("minecraft:oak_stairs", dm),
         a("minecraft:oak_stairs", dq),
         a("minecraft:oak_stairs", du),
         a("minecraft:oak_stairs", dy),
         a("minecraft:oak_stairs", dC)
      );
      a(
         853,
         a("minecraft:oak_stairs", dF),
         a("minecraft:oak_stairs", dp),
         a("minecraft:oak_stairs", dt),
         a("minecraft:oak_stairs", dx),
         a("minecraft:oak_stairs", dB),
         a("minecraft:oak_stairs", dF)
      );
      a(
         854,
         a("minecraft:oak_stairs", dE),
         a("minecraft:oak_stairs", do),
         a("minecraft:oak_stairs", ds),
         a("minecraft:oak_stairs", dw),
         a("minecraft:oak_stairs", dA),
         a("minecraft:oak_stairs", dE)
      );
      a(
         855,
         a("minecraft:oak_stairs", dD),
         a("minecraft:oak_stairs", dn),
         a("minecraft:oak_stairs", dr),
         a("minecraft:oak_stairs", dv),
         a("minecraft:oak_stairs", dz),
         a("minecraft:oak_stairs", dD)
      );
      a(866, a("minecraft:chest", Map.of("facing", "north", "type", "single")), a("minecraft:chest", bd));
      a(867, a("minecraft:chest", Map.of("facing", "south", "type", "single")), a("minecraft:chest", bA));
      a(868, a("minecraft:chest", Map.of("facing", "west", "type", "single")), a("minecraft:chest", ce));
      a(869, a("minecraft:chest", Map.of("facing", "east", "type", "single")), a("minecraft:chest", aG));
      a(
         880,
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "0", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "0", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "0", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "0", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "0", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "0", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "0", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "0", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "0", "south", "up", "west", "up"))
      );
      a(
         881,
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "1", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "1", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "1", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "1", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "1", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "1", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "1", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "1", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "1", "south", "up", "west", "up"))
      );
      a(
         882,
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "2", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "2", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "2", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "2", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "2", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "2", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "2", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "2", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "2", "south", "up", "west", "up"))
      );
      a(
         883,
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "3", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "3", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "3", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "3", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "3", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "3", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "3", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "3", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "3", "south", "up", "west", "up"))
      );
      a(
         884,
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "4", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "4", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "4", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "4", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "4", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "4", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "4", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "4", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "4", "south", "up", "west", "up"))
      );
      a(
         885,
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "5", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "5", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "5", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "5", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "5", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "5", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "5", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "5", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "5", "south", "up", "west", "up"))
      );
      a(
         886,
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "6", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "6", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "6", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "6", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "6", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "6", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "6", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "6", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "6", "south", "up", "west", "up"))
      );
      a(
         887,
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "7", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "7", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "7", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "7", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "7", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "7", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "7", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "7", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "7", "south", "up", "west", "up"))
      );
      a(
         888,
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "8", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "8", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "8", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "8", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "8", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "8", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "8", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "8", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "8", "south", "up", "west", "up"))
      );
      a(
         889,
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "9", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "9", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "9", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "9", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "9", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "9", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "9", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "9", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "9", "south", "up", "west", "up"))
      );
      a(
         890,
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "10", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "10", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "10", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "10", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "10", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "10", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "10", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "10", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "10", "south", "up", "west", "up"))
      );
      a(
         891,
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "11", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "11", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "11", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "11", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "11", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "11", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "11", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "11", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "11", "south", "up", "west", "up"))
      );
      a(
         892,
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "12", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "12", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "12", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "12", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "12", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "12", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "12", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "12", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "12", "south", "up", "west", "up"))
      );
      a(
         893,
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "13", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "13", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "13", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "13", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "13", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "13", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "13", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "13", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "13", "south", "up", "west", "up"))
      );
      a(
         894,
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "14", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "14", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "14", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "14", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "14", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "14", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "14", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "14", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "14", "south", "up", "west", "up"))
      );
      a(
         895,
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "none", "power", "15", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "side", "power", "15", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "none", "north", "up", "power", "15", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "none", "power", "15", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "side", "power", "15", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "side", "north", "up", "power", "15", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "none", "power", "15", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "side", "power", "15", "south", "up", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "none", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "none", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "none", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "side", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "side", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "side", "west", "up")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "up", "west", "none")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "up", "west", "side")),
         a("minecraft:redstone_wire", Map.of("east", "up", "north", "up", "power", "15", "south", "up", "west", "up"))
      );
      a(896, b("minecraft:diamond_ore"), b("minecraft:diamond_ore"));
      a(912, b("minecraft:diamond_block"), b("minecraft:diamond_block"));
      a(928, b("minecraft:crafting_table"), b("minecraft:crafting_table"));
      a(944, a("minecraft:wheat", h), a("minecraft:wheat", h));
      a(945, a("minecraft:wheat", m), a("minecraft:wheat", m));
      a(946, a("minecraft:wheat", x), a("minecraft:wheat", x));
      a(947, a("minecraft:wheat", C), a("minecraft:wheat", C));
      a(948, a("minecraft:wheat", D), a("minecraft:wheat", D));
      a(949, a("minecraft:wheat", E), a("minecraft:wheat", E));
      a(950, a("minecraft:wheat", F), a("minecraft:wheat", F));
      a(951, a("minecraft:wheat", G), a("minecraft:wheat", G));
      a(960, a("minecraft:farmland", Map.of("moisture", "0")), a("minecraft:farmland", Map.of("moisture", "0")));
      a(961, a("minecraft:farmland", Map.of("moisture", "1")), a("minecraft:farmland", Map.of("moisture", "1")));
      a(962, a("minecraft:farmland", Map.of("moisture", "2")), a("minecraft:farmland", Map.of("moisture", "2")));
      a(963, a("minecraft:farmland", Map.of("moisture", "3")), a("minecraft:farmland", Map.of("moisture", "3")));
      a(964, a("minecraft:farmland", Map.of("moisture", "4")), a("minecraft:farmland", Map.of("moisture", "4")));
      a(965, a("minecraft:farmland", Map.of("moisture", "5")), a("minecraft:farmland", Map.of("moisture", "5")));
      a(966, a("minecraft:farmland", Map.of("moisture", "6")), a("minecraft:farmland", Map.of("moisture", "6")));
      a(967, a("minecraft:farmland", Map.of("moisture", "7")), a("minecraft:farmland", Map.of("moisture", "7")));
      a(978, a("minecraft:furnace", Map.of("facing", "north", "lit", "false")), a("minecraft:furnace", bd));
      a(979, a("minecraft:furnace", Map.of("facing", "south", "lit", "false")), a("minecraft:furnace", bA));
      a(980, a("minecraft:furnace", Map.of("facing", "west", "lit", "false")), a("minecraft:furnace", ce));
      a(981, a("minecraft:furnace", Map.of("facing", "east", "lit", "false")), a("minecraft:furnace", aG));
      a(994, a("minecraft:furnace", Map.of("facing", "north", "lit", "true")), a("minecraft:lit_furnace", bd));
      a(995, a("minecraft:furnace", Map.of("facing", "south", "lit", "true")), a("minecraft:lit_furnace", bA));
      a(996, a("minecraft:furnace", Map.of("facing", "west", "lit", "true")), a("minecraft:lit_furnace", ce));
      a(997, a("minecraft:furnace", Map.of("facing", "east", "lit", "true")), a("minecraft:lit_furnace", aG));
      a(1008, a("minecraft:sign", fz), a("minecraft:standing_sign", fz));
      a(1009, a("minecraft:sign", fA), a("minecraft:standing_sign", fA));
      a(1010, a("minecraft:sign", fH), a("minecraft:standing_sign", fH));
      a(1011, a("minecraft:sign", fI), a("minecraft:standing_sign", fI));
      a(1012, a("minecraft:sign", fJ), a("minecraft:standing_sign", fJ));
      a(1013, a("minecraft:sign", fK), a("minecraft:standing_sign", fK));
      a(1014, a("minecraft:sign", fL), a("minecraft:standing_sign", fL));
      a(1015, a("minecraft:sign", fM), a("minecraft:standing_sign", fM));
      a(1016, a("minecraft:sign", fN), a("minecraft:standing_sign", fN));
      a(1017, a("minecraft:sign", fO), a("minecraft:standing_sign", fO));
      a(1018, a("minecraft:sign", fB), a("minecraft:standing_sign", fB));
      a(1019, a("minecraft:sign", fC), a("minecraft:standing_sign", fC));
      a(1020, a("minecraft:sign", fD), a("minecraft:standing_sign", fD));
      a(1021, a("minecraft:sign", fE), a("minecraft:standing_sign", fE));
      a(1022, a("minecraft:sign", fF), a("minecraft:standing_sign", fF));
      a(1023, a("minecraft:sign", fG), a("minecraft:standing_sign", fG));
   }

   private static void g() {
      a(
         1024,
         a("minecraft:oak_door", aN),
         a("minecraft:wooden_door", aL),
         a("minecraft:wooden_door", aP),
         a("minecraft:wooden_door", aN),
         a("minecraft:wooden_door", aR)
      );
      a(
         1025,
         a("minecraft:oak_door", bH),
         a("minecraft:wooden_door", bF),
         a("minecraft:wooden_door", bJ),
         a("minecraft:wooden_door", bH),
         a("minecraft:wooden_door", bL)
      );
      a(
         1026,
         a("minecraft:oak_door", cl),
         a("minecraft:wooden_door", cj),
         a("minecraft:wooden_door", cn),
         a("minecraft:wooden_door", cl),
         a("minecraft:wooden_door", cp)
      );
      a(
         1027,
         a("minecraft:oak_door", bk),
         a("minecraft:wooden_door", bi),
         a("minecraft:wooden_door", bm),
         a("minecraft:wooden_door", bk),
         a("minecraft:wooden_door", bo)
      );
      a(
         1028,
         a("minecraft:oak_door", aV),
         a("minecraft:wooden_door", aT),
         a("minecraft:wooden_door", aX),
         a("minecraft:wooden_door", aV),
         a("minecraft:wooden_door", aZ)
      );
      a(
         1029,
         a("minecraft:oak_door", bP),
         a("minecraft:wooden_door", bN),
         a("minecraft:wooden_door", bR),
         a("minecraft:wooden_door", bP),
         a("minecraft:wooden_door", bT)
      );
      a(
         1030,
         a("minecraft:oak_door", ct),
         a("minecraft:wooden_door", cr),
         a("minecraft:wooden_door", cv),
         a("minecraft:wooden_door", ct),
         a("minecraft:wooden_door", cx)
      );
      a(
         1031,
         a("minecraft:oak_door", bs),
         a("minecraft:wooden_door", bq),
         a("minecraft:wooden_door", bu),
         a("minecraft:wooden_door", bs),
         a("minecraft:wooden_door", bw)
      );
      a(
         1032,
         a("minecraft:oak_door", aM),
         a("minecraft:wooden_door", aM),
         a("minecraft:wooden_door", aU),
         a("minecraft:wooden_door", bj),
         a("minecraft:wooden_door", br),
         a("minecraft:wooden_door", bG),
         a("minecraft:wooden_door", bO),
         a("minecraft:wooden_door", ck),
         a("minecraft:wooden_door", cs)
      );
      a(
         1033,
         a("minecraft:oak_door", aO),
         a("minecraft:wooden_door", aO),
         a("minecraft:wooden_door", aW),
         a("minecraft:wooden_door", bl),
         a("minecraft:wooden_door", bt),
         a("minecraft:wooden_door", bI),
         a("minecraft:wooden_door", bQ),
         a("minecraft:wooden_door", cm),
         a("minecraft:wooden_door", cu)
      );
      a(
         1034,
         a("minecraft:oak_door", aQ),
         a("minecraft:wooden_door", aQ),
         a("minecraft:wooden_door", aY),
         a("minecraft:wooden_door", bn),
         a("minecraft:wooden_door", bv),
         a("minecraft:wooden_door", bK),
         a("minecraft:wooden_door", bS),
         a("minecraft:wooden_door", co),
         a("minecraft:wooden_door", cw)
      );
      a(
         1035,
         a("minecraft:oak_door", aS),
         a("minecraft:wooden_door", aS),
         a("minecraft:wooden_door", ba),
         a("minecraft:wooden_door", bp),
         a("minecraft:wooden_door", bx),
         a("minecraft:wooden_door", bM),
         a("minecraft:wooden_door", bU),
         a("minecraft:wooden_door", cq),
         a("minecraft:wooden_door", cy)
      );
      a(1036, a("minecraft:oak_door", aU));
      a(1037, a("minecraft:oak_door", bO));
      a(1038, a("minecraft:oak_door", cs));
      a(1039, a("minecraft:oak_door", br));
      a(1042, a("minecraft:ladder", bd), a("minecraft:ladder", bd));
      a(1043, a("minecraft:ladder", bA), a("minecraft:ladder", bA));
      a(1044, a("minecraft:ladder", ce), a("minecraft:ladder", ce));
      a(1045, a("minecraft:ladder", aG), a("minecraft:ladder", aG));
      a(1056, a("minecraft:rail", Map.of("shape", "north_south")), a("minecraft:rail", Map.of("shape", "north_south")));
      a(1057, a("minecraft:rail", Map.of("shape", "east_west")), a("minecraft:rail", Map.of("shape", "east_west")));
      a(1058, a("minecraft:rail", Map.of("shape", "ascending_east")), a("minecraft:rail", Map.of("shape", "ascending_east")));
      a(1059, a("minecraft:rail", Map.of("shape", "ascending_west")), a("minecraft:rail", Map.of("shape", "ascending_west")));
      a(1060, a("minecraft:rail", Map.of("shape", "ascending_north")), a("minecraft:rail", Map.of("shape", "ascending_north")));
      a(1061, a("minecraft:rail", Map.of("shape", "ascending_south")), a("minecraft:rail", Map.of("shape", "ascending_south")));
      a(1062, a("minecraft:rail", Map.of("shape", "south_east")), a("minecraft:rail", Map.of("shape", "south_east")));
      a(1063, a("minecraft:rail", Map.of("shape", "south_west")), a("minecraft:rail", Map.of("shape", "south_west")));
      a(1064, a("minecraft:rail", Map.of("shape", "north_west")), a("minecraft:rail", Map.of("shape", "north_west")));
      a(1065, a("minecraft:rail", Map.of("shape", "north_east")), a("minecraft:rail", Map.of("shape", "north_east")));
      a(
         1072,
         a("minecraft:cobblestone_stairs", cZ),
         a("minecraft:stone_stairs", cJ),
         a("minecraft:stone_stairs", cN),
         a("minecraft:stone_stairs", cR),
         a("minecraft:stone_stairs", cV),
         a("minecraft:stone_stairs", cZ)
      );
      a(
         1073,
         a("minecraft:cobblestone_stairs", dc),
         a("minecraft:stone_stairs", cM),
         a("minecraft:stone_stairs", cQ),
         a("minecraft:stone_stairs", cU),
         a("minecraft:stone_stairs", cY),
         a("minecraft:stone_stairs", dc)
      );
      a(
         1074,
         a("minecraft:cobblestone_stairs", db),
         a("minecraft:stone_stairs", cL),
         a("minecraft:stone_stairs", cP),
         a("minecraft:stone_stairs", cT),
         a("minecraft:stone_stairs", cX),
         a("minecraft:stone_stairs", db)
      );
      a(
         1075,
         a("minecraft:cobblestone_stairs", da),
         a("minecraft:stone_stairs", cK),
         a("minecraft:stone_stairs", cO),
         a("minecraft:stone_stairs", cS),
         a("minecraft:stone_stairs", cW),
         a("minecraft:stone_stairs", da)
      );
      a(
         1076,
         a("minecraft:cobblestone_stairs", dC),
         a("minecraft:stone_stairs", dm),
         a("minecraft:stone_stairs", dq),
         a("minecraft:stone_stairs", du),
         a("minecraft:stone_stairs", dy),
         a("minecraft:stone_stairs", dC)
      );
      a(
         1077,
         a("minecraft:cobblestone_stairs", dF),
         a("minecraft:stone_stairs", dp),
         a("minecraft:stone_stairs", dt),
         a("minecraft:stone_stairs", dx),
         a("minecraft:stone_stairs", dB),
         a("minecraft:stone_stairs", dF)
      );
      a(
         1078,
         a("minecraft:cobblestone_stairs", dE),
         a("minecraft:stone_stairs", do),
         a("minecraft:stone_stairs", ds),
         a("minecraft:stone_stairs", dw),
         a("minecraft:stone_stairs", dA),
         a("minecraft:stone_stairs", dE)
      );
      a(
         1079,
         a("minecraft:cobblestone_stairs", dD),
         a("minecraft:stone_stairs", dn),
         a("minecraft:stone_stairs", dr),
         a("minecraft:stone_stairs", dv),
         a("minecraft:stone_stairs", dz),
         a("minecraft:stone_stairs", dD)
      );
      a(1090, a("minecraft:wall_sign", bd), a("minecraft:wall_sign", bd));
      a(1091, a("minecraft:wall_sign", bA), a("minecraft:wall_sign", bA));
      a(1092, a("minecraft:wall_sign", ce), a("minecraft:wall_sign", ce));
      a(1093, a("minecraft:wall_sign", aG), a("minecraft:wall_sign", aG));
      a(
         1104,
         a("minecraft:lever", Map.of("face", "ceiling", "facing", "west", "powered", "false")),
         a("minecraft:lever", Map.of("facing", "down_x", "powered", "false"))
      );
      a(1105, a("minecraft:lever", ar), a("minecraft:lever", bb));
      a(1106, a("minecraft:lever", au), a("minecraft:lever", cz));
      a(1107, a("minecraft:lever", at), a("minecraft:lever", bV));
      a(1108, a("minecraft:lever", as), a("minecraft:lever", by));
      a(1109, a("minecraft:lever", ap), a("minecraft:lever", Map.of("facing", "up_z", "powered", "false")));
      a(
         1110,
         a("minecraft:lever", Map.of("face", "floor", "facing", "west", "powered", "false")),
         a("minecraft:lever", Map.of("facing", "up_x", "powered", "false"))
      );
      a(1111, a("minecraft:lever", an), a("minecraft:lever", Map.of("facing", "down_z", "powered", "false")));
      a(
         1112,
         a("minecraft:lever", Map.of("face", "ceiling", "facing", "west", "powered", "true")),
         a("minecraft:lever", Map.of("facing", "down_x", "powered", "true"))
      );
      a(1113, a("minecraft:lever", av), a("minecraft:lever", bc));
      a(1114, a("minecraft:lever", ay), a("minecraft:lever", cA));
      a(1115, a("minecraft:lever", ax), a("minecraft:lever", bW));
      a(1116, a("minecraft:lever", aw), a("minecraft:lever", bz));
      a(1117, a("minecraft:lever", aq), a("minecraft:lever", Map.of("facing", "up_z", "powered", "true")));
      a(
         1118,
         a("minecraft:lever", Map.of("face", "floor", "facing", "west", "powered", "true")),
         a("minecraft:lever", Map.of("facing", "up_x", "powered", "true"))
      );
      a(1119, a("minecraft:lever", ao), a("minecraft:lever", Map.of("facing", "down_z", "powered", "true")));
      a(1120, a("minecraft:stone_pressure_plate", el), a("minecraft:stone_pressure_plate", el));
      a(1121, a("minecraft:stone_pressure_plate", eK), a("minecraft:stone_pressure_plate", eK));
      a(
         1136,
         a("minecraft:iron_door", aN),
         a("minecraft:iron_door", aL),
         a("minecraft:iron_door", aP),
         a("minecraft:iron_door", aN),
         a("minecraft:iron_door", aR)
      );
      a(
         1137,
         a("minecraft:iron_door", bH),
         a("minecraft:iron_door", bF),
         a("minecraft:iron_door", bJ),
         a("minecraft:iron_door", bH),
         a("minecraft:iron_door", bL)
      );
      a(
         1138,
         a("minecraft:iron_door", cl),
         a("minecraft:iron_door", cj),
         a("minecraft:iron_door", cn),
         a("minecraft:iron_door", cl),
         a("minecraft:iron_door", cp)
      );
      a(
         1139,
         a("minecraft:iron_door", bk),
         a("minecraft:iron_door", bi),
         a("minecraft:iron_door", bm),
         a("minecraft:iron_door", bk),
         a("minecraft:iron_door", bo)
      );
      a(
         1140,
         a("minecraft:iron_door", aV),
         a("minecraft:iron_door", aT),
         a("minecraft:iron_door", aX),
         a("minecraft:iron_door", aV),
         a("minecraft:iron_door", aZ)
      );
      a(
         1141,
         a("minecraft:iron_door", bP),
         a("minecraft:iron_door", bN),
         a("minecraft:iron_door", bR),
         a("minecraft:iron_door", bP),
         a("minecraft:iron_door", bT)
      );
      a(
         1142,
         a("minecraft:iron_door", ct),
         a("minecraft:iron_door", cr),
         a("minecraft:iron_door", cv),
         a("minecraft:iron_door", ct),
         a("minecraft:iron_door", cx)
      );
      a(
         1143,
         a("minecraft:iron_door", bs),
         a("minecraft:iron_door", bq),
         a("minecraft:iron_door", bu),
         a("minecraft:iron_door", bs),
         a("minecraft:iron_door", bw)
      );
      a(
         1144,
         a("minecraft:iron_door", aM),
         a("minecraft:iron_door", aM),
         a("minecraft:iron_door", aU),
         a("minecraft:iron_door", bj),
         a("minecraft:iron_door", br),
         a("minecraft:iron_door", bG),
         a("minecraft:iron_door", bO),
         a("minecraft:iron_door", ck),
         a("minecraft:iron_door", cs)
      );
      a(
         1145,
         a("minecraft:iron_door", aO),
         a("minecraft:iron_door", aO),
         a("minecraft:iron_door", aW),
         a("minecraft:iron_door", bl),
         a("minecraft:iron_door", bt),
         a("minecraft:iron_door", bI),
         a("minecraft:iron_door", bQ),
         a("minecraft:iron_door", cm),
         a("minecraft:iron_door", cu)
      );
      a(
         1146,
         a("minecraft:iron_door", aQ),
         a("minecraft:iron_door", aQ),
         a("minecraft:iron_door", aY),
         a("minecraft:iron_door", bn),
         a("minecraft:iron_door", bv),
         a("minecraft:iron_door", bK),
         a("minecraft:iron_door", bS),
         a("minecraft:iron_door", co),
         a("minecraft:iron_door", cw)
      );
      a(
         1147,
         a("minecraft:iron_door", aS),
         a("minecraft:iron_door", aS),
         a("minecraft:iron_door", ba),
         a("minecraft:iron_door", bp),
         a("minecraft:iron_door", bx),
         a("minecraft:iron_door", bM),
         a("minecraft:iron_door", bU),
         a("minecraft:iron_door", cq),
         a("minecraft:iron_door", cy)
      );
      a(1148, a("minecraft:iron_door", aU));
      a(1149, a("minecraft:iron_door", bO));
      a(1150, a("minecraft:iron_door", cs));
      a(1151, a("minecraft:iron_door", br));
      a(1152, a("minecraft:oak_pressure_plate", el), a("minecraft:wooden_pressure_plate", el));
      a(1153, a("minecraft:oak_pressure_plate", eK), a("minecraft:wooden_pressure_plate", eK));
      a(1168, a("minecraft:redstone_ore", dX), b("minecraft:redstone_ore"));
      a(1184, a("minecraft:redstone_ore", dY), b("minecraft:lit_redstone_ore"));
      a(1201, a("minecraft:redstone_wall_torch", Map.of("facing", "east", "lit", "false")), a("minecraft:unlit_redstone_torch", aG));
      a(1202, a("minecraft:redstone_wall_torch", Map.of("facing", "west", "lit", "false")), a("minecraft:unlit_redstone_torch", ce));
      a(1203, a("minecraft:redstone_wall_torch", Map.of("facing", "south", "lit", "false")), a("minecraft:unlit_redstone_torch", bA));
      a(1204, a("minecraft:redstone_wall_torch", Map.of("facing", "north", "lit", "false")), a("minecraft:unlit_redstone_torch", bd));
      a(1205, a("minecraft:redstone_torch", dX), a("minecraft:unlit_redstone_torch", bX));
      a(1217, a("minecraft:redstone_wall_torch", Map.of("facing", "east", "lit", "true")), a("minecraft:redstone_torch", aG));
      a(1218, a("minecraft:redstone_wall_torch", Map.of("facing", "west", "lit", "true")), a("minecraft:redstone_torch", ce));
      a(1219, a("minecraft:redstone_wall_torch", Map.of("facing", "south", "lit", "true")), a("minecraft:redstone_torch", bA));
      a(1220, a("minecraft:redstone_wall_torch", Map.of("facing", "north", "lit", "true")), a("minecraft:redstone_torch", bd));
      a(1221, a("minecraft:redstone_torch", dY), a("minecraft:redstone_torch", bX));
      a(1232, a("minecraft:stone_button", an), a("minecraft:stone_button", aE));
      a(1233, a("minecraft:stone_button", ar), a("minecraft:stone_button", bb));
      a(1234, a("minecraft:stone_button", au), a("minecraft:stone_button", cz));
      a(1235, a("minecraft:stone_button", at), a("minecraft:stone_button", bV));
      a(1236, a("minecraft:stone_button", as), a("minecraft:stone_button", by));
      a(1237, a("minecraft:stone_button", ap), a("minecraft:stone_button", cc));
      a(1240, a("minecraft:stone_button", ao), a("minecraft:stone_button", aF));
      a(1241, a("minecraft:stone_button", av), a("minecraft:stone_button", bc));
      a(1242, a("minecraft:stone_button", ay), a("minecraft:stone_button", cA));
      a(1243, a("minecraft:stone_button", ax), a("minecraft:stone_button", bW));
      a(1244, a("minecraft:stone_button", aw), a("minecraft:stone_button", bz));
      a(1245, a("minecraft:stone_button", aq), a("minecraft:stone_button", cd));
      a(1248, a("minecraft:snow", Map.of("layers", "1")), a("minecraft:snow_layer", Map.of("layers", "1")));
      a(1249, a("minecraft:snow", Map.of("layers", "2")), a("minecraft:snow_layer", Map.of("layers", "2")));
      a(1250, a("minecraft:snow", Map.of("layers", "3")), a("minecraft:snow_layer", Map.of("layers", "3")));
      a(1251, a("minecraft:snow", Map.of("layers", "4")), a("minecraft:snow_layer", Map.of("layers", "4")));
      a(1252, a("minecraft:snow", Map.of("layers", "5")), a("minecraft:snow_layer", Map.of("layers", "5")));
      a(1253, a("minecraft:snow", Map.of("layers", "6")), a("minecraft:snow_layer", Map.of("layers", "6")));
      a(1254, a("minecraft:snow", Map.of("layers", "7")), a("minecraft:snow_layer", Map.of("layers", "7")));
      a(1255, a("minecraft:snow", Map.of("layers", "8")), a("minecraft:snow_layer", Map.of("layers", "8")));
      a(1264, b("minecraft:ice"), b("minecraft:ice"));
   }

   private static void h() {
      a(1280, b("minecraft:snow_block"), b("minecraft:snow"));
      a(1296, a("minecraft:cactus", h), a("minecraft:cactus", h));
      a(1297, a("minecraft:cactus", m), a("minecraft:cactus", m));
      a(1298, a("minecraft:cactus", x), a("minecraft:cactus", x));
      a(1299, a("minecraft:cactus", C), a("minecraft:cactus", C));
      a(1300, a("minecraft:cactus", D), a("minecraft:cactus", D));
      a(1301, a("minecraft:cactus", E), a("minecraft:cactus", E));
      a(1302, a("minecraft:cactus", F), a("minecraft:cactus", F));
      a(1303, a("minecraft:cactus", G), a("minecraft:cactus", G));
      a(1304, a("minecraft:cactus", H), a("minecraft:cactus", H));
      a(1305, a("minecraft:cactus", I), a("minecraft:cactus", I));
      a(1306, a("minecraft:cactus", n), a("minecraft:cactus", n));
      a(1307, a("minecraft:cactus", o), a("minecraft:cactus", o));
      a(1308, a("minecraft:cactus", p), a("minecraft:cactus", p));
      a(1309, a("minecraft:cactus", q), a("minecraft:cactus", q));
      a(1310, a("minecraft:cactus", r), a("minecraft:cactus", r));
      a(1311, a("minecraft:cactus", s), a("minecraft:cactus", s));
      a(1312, b("minecraft:clay"), b("minecraft:clay"));
      a(1328, a("minecraft:sugar_cane", h), a("minecraft:reeds", h));
      a(1329, a("minecraft:sugar_cane", m), a("minecraft:reeds", m));
      a(1330, a("minecraft:sugar_cane", x), a("minecraft:reeds", x));
      a(1331, a("minecraft:sugar_cane", C), a("minecraft:reeds", C));
      a(1332, a("minecraft:sugar_cane", D), a("minecraft:reeds", D));
      a(1333, a("minecraft:sugar_cane", E), a("minecraft:reeds", E));
      a(1334, a("minecraft:sugar_cane", F), a("minecraft:reeds", F));
      a(1335, a("minecraft:sugar_cane", G), a("minecraft:reeds", G));
      a(1336, a("minecraft:sugar_cane", H), a("minecraft:reeds", H));
      a(1337, a("minecraft:sugar_cane", I), a("minecraft:reeds", I));
      a(1338, a("minecraft:sugar_cane", n), a("minecraft:reeds", n));
      a(1339, a("minecraft:sugar_cane", o), a("minecraft:reeds", o));
      a(1340, a("minecraft:sugar_cane", p), a("minecraft:reeds", p));
      a(1341, a("minecraft:sugar_cane", q), a("minecraft:reeds", q));
      a(1342, a("minecraft:sugar_cane", r), a("minecraft:reeds", r));
      a(1343, a("minecraft:sugar_cane", s), a("minecraft:reeds", s));
      a(1344, a("minecraft:jukebox", Map.of("has_record", "false")), a("minecraft:jukebox", Map.of("has_record", "false")));
      a(1345, a("minecraft:jukebox", Map.of("has_record", "true")), a("minecraft:jukebox", Map.of("has_record", "true")));
      a(
         1360,
         a("minecraft:oak_fence", gu),
         a("minecraft:fence", gu),
         a("minecraft:fence", gC),
         a("minecraft:fence", gw),
         a("minecraft:fence", gE),
         a("minecraft:fence", gy),
         a("minecraft:fence", gG),
         a("minecraft:fence", gA),
         a("minecraft:fence", gI),
         a("minecraft:fence", gv),
         a("minecraft:fence", gD),
         a("minecraft:fence", gx),
         a("minecraft:fence", gF),
         a("minecraft:fence", gz),
         a("minecraft:fence", gH),
         a("minecraft:fence", gB),
         a("minecraft:fence", gJ)
      );
      a(1376, a("minecraft:carved_pumpkin", bA), a("minecraft:pumpkin", bA));
      a(1377, a("minecraft:carved_pumpkin", ce), a("minecraft:pumpkin", ce));
      a(1378, a("minecraft:carved_pumpkin", bd), a("minecraft:pumpkin", bd));
      a(1379, a("minecraft:carved_pumpkin", aG), a("minecraft:pumpkin", aG));
      a(1392, b("minecraft:netherrack"), b("minecraft:netherrack"));
      a(1408, b("minecraft:soul_sand"), b("minecraft:soul_sand"));
      a(1424, b("minecraft:glowstone"), b("minecraft:glowstone"));
      a(1441, a("minecraft:portal", J), a("minecraft:portal", J));
      a(1442, a("minecraft:portal", L), a("minecraft:portal", L));
      a(1456, a("minecraft:jack_o_lantern", bA), a("minecraft:lit_pumpkin", bA));
      a(1457, a("minecraft:jack_o_lantern", ce), a("minecraft:lit_pumpkin", ce));
      a(1458, a("minecraft:jack_o_lantern", bd), a("minecraft:lit_pumpkin", bd));
      a(1459, a("minecraft:jack_o_lantern", aG), a("minecraft:lit_pumpkin", aG));
      a(1472, a("minecraft:cake", Map.of("bites", "0")), a("minecraft:cake", Map.of("bites", "0")));
      a(1473, a("minecraft:cake", Map.of("bites", "1")), a("minecraft:cake", Map.of("bites", "1")));
      a(1474, a("minecraft:cake", Map.of("bites", "2")), a("minecraft:cake", Map.of("bites", "2")));
      a(1475, a("minecraft:cake", Map.of("bites", "3")), a("minecraft:cake", Map.of("bites", "3")));
      a(1476, a("minecraft:cake", Map.of("bites", "4")), a("minecraft:cake", Map.of("bites", "4")));
      a(1477, a("minecraft:cake", Map.of("bites", "5")), a("minecraft:cake", Map.of("bites", "5")));
      a(1478, a("minecraft:cake", Map.of("bites", "6")), a("minecraft:cake", Map.of("bites", "6")));
      a(
         1488,
         a("minecraft:repeater", Map.of("delay", "1", "facing", "south", "locked", "false", "powered", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "1", "facing", "south", "locked", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "1", "facing", "south", "locked", "true"))
      );
      a(
         1489,
         a("minecraft:repeater", Map.of("delay", "1", "facing", "west", "locked", "false", "powered", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "1", "facing", "west", "locked", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "1", "facing", "west", "locked", "true"))
      );
      a(
         1490,
         a("minecraft:repeater", Map.of("delay", "1", "facing", "north", "locked", "false", "powered", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "1", "facing", "north", "locked", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "1", "facing", "north", "locked", "true"))
      );
      a(
         1491,
         a("minecraft:repeater", Map.of("delay", "1", "facing", "east", "locked", "false", "powered", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "1", "facing", "east", "locked", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "1", "facing", "east", "locked", "true"))
      );
      a(
         1492,
         a("minecraft:repeater", Map.of("delay", "2", "facing", "south", "locked", "false", "powered", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "2", "facing", "south", "locked", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "2", "facing", "south", "locked", "true"))
      );
      a(
         1493,
         a("minecraft:repeater", Map.of("delay", "2", "facing", "west", "locked", "false", "powered", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "2", "facing", "west", "locked", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "2", "facing", "west", "locked", "true"))
      );
      a(
         1494,
         a("minecraft:repeater", Map.of("delay", "2", "facing", "north", "locked", "false", "powered", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "2", "facing", "north", "locked", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "2", "facing", "north", "locked", "true"))
      );
      a(
         1495,
         a("minecraft:repeater", Map.of("delay", "2", "facing", "east", "locked", "false", "powered", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "2", "facing", "east", "locked", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "2", "facing", "east", "locked", "true"))
      );
      a(
         1496,
         a("minecraft:repeater", Map.of("delay", "3", "facing", "south", "locked", "false", "powered", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "3", "facing", "south", "locked", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "3", "facing", "south", "locked", "true"))
      );
      a(
         1497,
         a("minecraft:repeater", Map.of("delay", "3", "facing", "west", "locked", "false", "powered", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "3", "facing", "west", "locked", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "3", "facing", "west", "locked", "true"))
      );
      a(
         1498,
         a("minecraft:repeater", Map.of("delay", "3", "facing", "north", "locked", "false", "powered", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "3", "facing", "north", "locked", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "3", "facing", "north", "locked", "true"))
      );
      a(
         1499,
         a("minecraft:repeater", Map.of("delay", "3", "facing", "east", "locked", "false", "powered", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "3", "facing", "east", "locked", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "3", "facing", "east", "locked", "true"))
      );
      a(
         1500,
         a("minecraft:repeater", Map.of("delay", "4", "facing", "south", "locked", "false", "powered", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "4", "facing", "south", "locked", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "4", "facing", "south", "locked", "true"))
      );
      a(
         1501,
         a("minecraft:repeater", Map.of("delay", "4", "facing", "west", "locked", "false", "powered", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "4", "facing", "west", "locked", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "4", "facing", "west", "locked", "true"))
      );
      a(
         1502,
         a("minecraft:repeater", Map.of("delay", "4", "facing", "north", "locked", "false", "powered", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "4", "facing", "north", "locked", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "4", "facing", "north", "locked", "true"))
      );
      a(
         1503,
         a("minecraft:repeater", Map.of("delay", "4", "facing", "east", "locked", "false", "powered", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "4", "facing", "east", "locked", "false")),
         a("minecraft:unpowered_repeater", Map.of("delay", "4", "facing", "east", "locked", "true"))
      );
      a(
         1504,
         a("minecraft:repeater", Map.of("delay", "1", "facing", "south", "locked", "false", "powered", "true")),
         a("minecraft:powered_repeater", Map.of("delay", "1", "facing", "south", "locked", "false")),
         a("minecraft:powered_repeater", Map.of("delay", "1", "facing", "south", "locked", "true"))
      );
      a(
         1505,
         a("minecraft:repeater", Map.of("delay", "1", "facing", "west", "locked", "false", "powered", "true")),
         a("minecraft:powered_repeater", Map.of("delay", "1", "facing", "west", "locked", "false")),
         a("minecraft:powered_repeater", Map.of("delay", "1", "facing", "west", "locked", "true"))
      );
      a(
         1506,
         a("minecraft:repeater", Map.of("delay", "1", "facing", "north", "locked", "false", "powered", "true")),
         a("minecraft:powered_repeater", Map.of("delay", "1", "facing", "north", "locked", "false")),
         a("minecraft:powered_repeater", Map.of("delay", "1", "facing", "north", "locked", "true"))
      );
      a(
         1507,
         a("minecraft:repeater", Map.of("delay", "1", "facing", "east", "locked", "false", "powered", "true")),
         a("minecraft:powered_repeater", Map.of("delay", "1", "facing", "east", "locked", "false")),
         a("minecraft:powered_repeater", Map.of("delay", "1", "facing", "east", "locked", "true"))
      );
      a(
         1508,
         a("minecraft:repeater", Map.of("delay", "2", "facing", "south", "locked", "false", "powered", "true")),
         a("minecraft:powered_repeater", Map.of("delay", "2", "facing", "south", "locked", "false")),
         a("minecraft:powered_repeater", Map.of("delay", "2", "facing", "south", "locked", "true"))
      );
      a(
         1509,
         a("minecraft:repeater", Map.of("delay", "2", "facing", "west", "locked", "false", "powered", "true")),
         a("minecraft:powered_repeater", Map.of("delay", "2", "facing", "west", "locked", "false")),
         a("minecraft:powered_repeater", Map.of("delay", "2", "facing", "west", "locked", "true"))
      );
      a(
         1510,
         a("minecraft:repeater", Map.of("delay", "2", "facing", "north", "locked", "false", "powered", "true")),
         a("minecraft:powered_repeater", Map.of("delay", "2", "facing", "north", "locked", "false")),
         a("minecraft:powered_repeater", Map.of("delay", "2", "facing", "north", "locked", "true"))
      );
      a(
         1511,
         a("minecraft:repeater", Map.of("delay", "2", "facing", "east", "locked", "false", "powered", "true")),
         a("minecraft:powered_repeater", Map.of("delay", "2", "facing", "east", "locked", "false")),
         a("minecraft:powered_repeater", Map.of("delay", "2", "facing", "east", "locked", "true"))
      );
      a(
         1512,
         a("minecraft:repeater", Map.of("delay", "3", "facing", "south", "locked", "false", "powered", "true")),
         a("minecraft:powered_repeater", Map.of("delay", "3", "facing", "south", "locked", "false")),
         a("minecraft:powered_repeater", Map.of("delay", "3", "facing", "south", "locked", "true"))
      );
      a(
         1513,
         a("minecraft:repeater", Map.of("delay", "3", "facing", "west", "locked", "false", "powered", "true")),
         a("minecraft:powered_repeater", Map.of("delay", "3", "facing", "west", "locked", "false")),
         a("minecraft:powered_repeater", Map.of("delay", "3", "facing", "west", "locked", "true"))
      );
      a(
         1514,
         a("minecraft:repeater", Map.of("delay", "3", "facing", "north", "locked", "false", "powered", "true")),
         a("minecraft:powered_repeater", Map.of("delay", "3", "facing", "north", "locked", "false")),
         a("minecraft:powered_repeater", Map.of("delay", "3", "facing", "north", "locked", "true"))
      );
      a(
         1515,
         a("minecraft:repeater", Map.of("delay", "3", "facing", "east", "locked", "false", "powered", "true")),
         a("minecraft:powered_repeater", Map.of("delay", "3", "facing", "east", "locked", "false")),
         a("minecraft:powered_repeater", Map.of("delay", "3", "facing", "east", "locked", "true"))
      );
      a(
         1516,
         a("minecraft:repeater", Map.of("delay", "4", "facing", "south", "locked", "false", "powered", "true")),
         a("minecraft:powered_repeater", Map.of("delay", "4", "facing", "south", "locked", "false")),
         a("minecraft:powered_repeater", Map.of("delay", "4", "facing", "south", "locked", "true"))
      );
      a(
         1517,
         a("minecraft:repeater", Map.of("delay", "4", "facing", "west", "locked", "false", "powered", "true")),
         a("minecraft:powered_repeater", Map.of("delay", "4", "facing", "west", "locked", "false")),
         a("minecraft:powered_repeater", Map.of("delay", "4", "facing", "west", "locked", "true"))
      );
      a(
         1518,
         a("minecraft:repeater", Map.of("delay", "4", "facing", "north", "locked", "false", "powered", "true")),
         a("minecraft:powered_repeater", Map.of("delay", "4", "facing", "north", "locked", "false")),
         a("minecraft:powered_repeater", Map.of("delay", "4", "facing", "north", "locked", "true"))
      );
      a(
         1519,
         a("minecraft:repeater", Map.of("delay", "4", "facing", "east", "locked", "false", "powered", "true")),
         a("minecraft:powered_repeater", Map.of("delay", "4", "facing", "east", "locked", "false")),
         a("minecraft:powered_repeater", Map.of("delay", "4", "facing", "east", "locked", "true"))
      );
      a(1520, b("minecraft:white_stained_glass"), a("minecraft:stained_glass", ae));
      a(1521, b("minecraft:orange_stained_glass"), a("minecraft:stained_glass", Z));
      a(1522, b("minecraft:magenta_stained_glass"), a("minecraft:stained_glass", Y));
      a(1523, b("minecraft:light_blue_stained_glass"), a("minecraft:stained_glass", W));
      a(1524, b("minecraft:yellow_stained_glass"), a("minecraft:stained_glass", af));
      a(1525, b("minecraft:lime_stained_glass"), a("minecraft:stained_glass", X));
      a(1526, b("minecraft:pink_stained_glass"), a("minecraft:stained_glass", aa));
      a(1527, b("minecraft:gray_stained_glass"), a("minecraft:stained_glass", U));
      a(1528, b("minecraft:light_gray_stained_glass"), a("minecraft:stained_glass", ad));
      a(1529, b("minecraft:cyan_stained_glass"), a("minecraft:stained_glass", T));
      a(1530, b("minecraft:purple_stained_glass"), a("minecraft:stained_glass", ab));
      a(1531, b("minecraft:blue_stained_glass"), a("minecraft:stained_glass", R));
      a(1532, b("minecraft:brown_stained_glass"), a("minecraft:stained_glass", S));
      a(1533, b("minecraft:green_stained_glass"), a("minecraft:stained_glass", V));
      a(1534, b("minecraft:red_stained_glass"), a("minecraft:stained_glass", ac));
      a(1535, b("minecraft:black_stained_glass"), a("minecraft:stained_glass", Q));
   }

   private static void i() {
      a(1536, a("minecraft:oak_trapdoor", cC), a("minecraft:trapdoor", cC));
      a(1537, a("minecraft:oak_trapdoor", cD), a("minecraft:trapdoor", cD));
      a(1538, a("minecraft:oak_trapdoor", cE), a("minecraft:trapdoor", cE));
      a(1539, a("minecraft:oak_trapdoor", cB), a("minecraft:trapdoor", cB));
      a(1540, a("minecraft:oak_trapdoor", cG), a("minecraft:trapdoor", cG));
      a(1541, a("minecraft:oak_trapdoor", cH), a("minecraft:trapdoor", cH));
      a(1542, a("minecraft:oak_trapdoor", cI), a("minecraft:trapdoor", cI));
      a(1543, a("minecraft:oak_trapdoor", cF), a("minecraft:trapdoor", cF));
      a(1544, a("minecraft:oak_trapdoor", df), a("minecraft:trapdoor", df));
      a(1545, a("minecraft:oak_trapdoor", dg), a("minecraft:trapdoor", dg));
      a(1546, a("minecraft:oak_trapdoor", dh), a("minecraft:trapdoor", dh));
      a(1547, a("minecraft:oak_trapdoor", de), a("minecraft:trapdoor", de));
      a(1548, a("minecraft:oak_trapdoor", dj), a("minecraft:trapdoor", dj));
      a(1549, a("minecraft:oak_trapdoor", dk), a("minecraft:trapdoor", dk));
      a(1550, a("minecraft:oak_trapdoor", dl), a("minecraft:trapdoor", dl));
      a(1551, a("minecraft:oak_trapdoor", di), a("minecraft:trapdoor", di));
      a(1552, b("minecraft:infested_stone"), a("minecraft:monster_egg", Map.of("variant", "stone")));
      a(1553, b("minecraft:infested_cobblestone"), a("minecraft:monster_egg", Map.of("variant", "cobblestone")));
      a(1554, b("minecraft:infested_stone_bricks"), a("minecraft:monster_egg", Map.of("variant", "stone_brick")));
      a(1555, b("minecraft:infested_mossy_stone_bricks"), a("minecraft:monster_egg", Map.of("variant", "mossy_brick")));
      a(1556, b("minecraft:infested_cracked_stone_bricks"), a("minecraft:monster_egg", Map.of("variant", "cracked_brick")));
      a(1557, b("minecraft:infested_chiseled_stone_bricks"), a("minecraft:monster_egg", Map.of("variant", "chiseled_brick")));
      a(1568, b("minecraft:stone_bricks"), a("minecraft:stonebrick", Map.of("variant", "stonebrick")));
      a(1569, b("minecraft:mossy_stone_bricks"), a("minecraft:stonebrick", Map.of("variant", "mossy_stonebrick")));
      a(1570, b("minecraft:cracked_stone_bricks"), a("minecraft:stonebrick", Map.of("variant", "cracked_stonebrick")));
      a(1571, b("minecraft:chiseled_stone_bricks"), a("minecraft:stonebrick", Map.of("variant", "chiseled_stonebrick")));
      a(1584, a("minecraft:brown_mushroom_block", dZ), a("minecraft:brown_mushroom_block", Map.of("variant", "all_inside")));
      a(1585, a("minecraft:brown_mushroom_block", eh), a("minecraft:brown_mushroom_block", Map.of("variant", "north_west")));
      a(1586, a("minecraft:brown_mushroom_block", eg), a("minecraft:brown_mushroom_block", Map.of("variant", "north")));
      a(1587, a("minecraft:brown_mushroom_block", ej), a("minecraft:brown_mushroom_block", Map.of("variant", "north_east")));
      a(1588, a("minecraft:brown_mushroom_block", ec), a("minecraft:brown_mushroom_block", Map.of("variant", "west")));
      a(1589, a("minecraft:brown_mushroom_block", ea), a("minecraft:brown_mushroom_block", Map.of("variant", "center")));
      a(1590, a("minecraft:brown_mushroom_block", ee), a("minecraft:brown_mushroom_block", Map.of("variant", "east")));
      a(1591, a("minecraft:brown_mushroom_block", ed), a("minecraft:brown_mushroom_block", Map.of("variant", "south_west")));
      a(1592, a("minecraft:brown_mushroom_block", eb), a("minecraft:brown_mushroom_block", Map.of("variant", "south")));
      a(1593, a("minecraft:brown_mushroom_block", ef), a("minecraft:brown_mushroom_block", Map.of("variant", "south_east")));
      a(1594, a("minecraft:mushroom_stem", ei), a("minecraft:brown_mushroom_block", Map.of("variant", "stem")));
      a(1595, a("minecraft:brown_mushroom_block", dZ));
      a(1596, a("minecraft:brown_mushroom_block", dZ));
      a(1597, a("minecraft:brown_mushroom_block", dZ));
      a(1598, a("minecraft:brown_mushroom_block", ek), a("minecraft:brown_mushroom_block", Map.of("variant", "all_outside")));
      a(1599, a("minecraft:mushroom_stem", ek), a("minecraft:brown_mushroom_block", Map.of("variant", "all_stem")));
      a(1600, a("minecraft:red_mushroom_block", dZ), a("minecraft:red_mushroom_block", Map.of("variant", "all_inside")));
      a(1601, a("minecraft:red_mushroom_block", eh), a("minecraft:red_mushroom_block", Map.of("variant", "north_west")));
      a(1602, a("minecraft:red_mushroom_block", eg), a("minecraft:red_mushroom_block", Map.of("variant", "north")));
      a(1603, a("minecraft:red_mushroom_block", ej), a("minecraft:red_mushroom_block", Map.of("variant", "north_east")));
      a(1604, a("minecraft:red_mushroom_block", ec), a("minecraft:red_mushroom_block", Map.of("variant", "west")));
      a(1605, a("minecraft:red_mushroom_block", ea), a("minecraft:red_mushroom_block", Map.of("variant", "center")));
      a(1606, a("minecraft:red_mushroom_block", ee), a("minecraft:red_mushroom_block", Map.of("variant", "east")));
      a(1607, a("minecraft:red_mushroom_block", ed), a("minecraft:red_mushroom_block", Map.of("variant", "south_west")));
      a(1608, a("minecraft:red_mushroom_block", eb), a("minecraft:red_mushroom_block", Map.of("variant", "south")));
      a(1609, a("minecraft:red_mushroom_block", ef), a("minecraft:red_mushroom_block", Map.of("variant", "south_east")));
      a(1610, a("minecraft:mushroom_stem", ei), a("minecraft:red_mushroom_block", Map.of("variant", "stem")));
      a(1611, a("minecraft:red_mushroom_block", dZ));
      a(1612, a("minecraft:red_mushroom_block", dZ));
      a(1613, a("minecraft:red_mushroom_block", dZ));
      a(1614, a("minecraft:red_mushroom_block", ek), a("minecraft:red_mushroom_block", Map.of("variant", "all_outside")));
      a(1615, a("minecraft:mushroom_stem", ek), a("minecraft:red_mushroom_block", Map.of("variant", "all_stem")));
      a(
         1616,
         a("minecraft:iron_bars", gu),
         a("minecraft:iron_bars", gu),
         a("minecraft:iron_bars", gC),
         a("minecraft:iron_bars", gw),
         a("minecraft:iron_bars", gE),
         a("minecraft:iron_bars", gy),
         a("minecraft:iron_bars", gG),
         a("minecraft:iron_bars", gA),
         a("minecraft:iron_bars", gI),
         a("minecraft:iron_bars", gv),
         a("minecraft:iron_bars", gD),
         a("minecraft:iron_bars", gx),
         a("minecraft:iron_bars", gF),
         a("minecraft:iron_bars", gz),
         a("minecraft:iron_bars", gH),
         a("minecraft:iron_bars", gB),
         a("minecraft:iron_bars", gJ)
      );
      a(
         1632,
         a("minecraft:glass_pane", gu),
         a("minecraft:glass_pane", gu),
         a("minecraft:glass_pane", gC),
         a("minecraft:glass_pane", gw),
         a("minecraft:glass_pane", gE),
         a("minecraft:glass_pane", gy),
         a("minecraft:glass_pane", gG),
         a("minecraft:glass_pane", gA),
         a("minecraft:glass_pane", gI),
         a("minecraft:glass_pane", gv),
         a("minecraft:glass_pane", gD),
         a("minecraft:glass_pane", gx),
         a("minecraft:glass_pane", gF),
         a("minecraft:glass_pane", gz),
         a("minecraft:glass_pane", gH),
         a("minecraft:glass_pane", gB),
         a("minecraft:glass_pane", gJ)
      );
      a(1648, b("minecraft:melon_block"), b("minecraft:melon_block"));
      a(
         1664,
         a("minecraft:pumpkin_stem", h),
         a("minecraft:pumpkin_stem", i),
         a("minecraft:pumpkin_stem", j),
         a("minecraft:pumpkin_stem", k),
         a("minecraft:pumpkin_stem", Map.of("age", "0", "facing", "up")),
         a("minecraft:pumpkin_stem", l)
      );
      a(
         1665,
         a("minecraft:pumpkin_stem", m),
         a("minecraft:pumpkin_stem", t),
         a("minecraft:pumpkin_stem", u),
         a("minecraft:pumpkin_stem", v),
         a("minecraft:pumpkin_stem", Map.of("age", "1", "facing", "up")),
         a("minecraft:pumpkin_stem", w)
      );
      a(
         1666,
         a("minecraft:pumpkin_stem", x),
         a("minecraft:pumpkin_stem", y),
         a("minecraft:pumpkin_stem", z),
         a("minecraft:pumpkin_stem", A),
         a("minecraft:pumpkin_stem", Map.of("age", "2", "facing", "up")),
         a("minecraft:pumpkin_stem", B)
      );
      a(
         1667,
         a("minecraft:pumpkin_stem", C),
         a("minecraft:pumpkin_stem", Map.of("age", "3", "facing", "east")),
         a("minecraft:pumpkin_stem", Map.of("age", "3", "facing", "north")),
         a("minecraft:pumpkin_stem", Map.of("age", "3", "facing", "south")),
         a("minecraft:pumpkin_stem", Map.of("age", "3", "facing", "up")),
         a("minecraft:pumpkin_stem", Map.of("age", "3", "facing", "west"))
      );
      a(
         1668,
         a("minecraft:pumpkin_stem", D),
         a("minecraft:pumpkin_stem", Map.of("age", "4", "facing", "east")),
         a("minecraft:pumpkin_stem", Map.of("age", "4", "facing", "north")),
         a("minecraft:pumpkin_stem", Map.of("age", "4", "facing", "south")),
         a("minecraft:pumpkin_stem", Map.of("age", "4", "facing", "up")),
         a("minecraft:pumpkin_stem", Map.of("age", "4", "facing", "west"))
      );
      a(
         1669,
         a("minecraft:pumpkin_stem", E),
         a("minecraft:pumpkin_stem", Map.of("age", "5", "facing", "east")),
         a("minecraft:pumpkin_stem", Map.of("age", "5", "facing", "north")),
         a("minecraft:pumpkin_stem", Map.of("age", "5", "facing", "south")),
         a("minecraft:pumpkin_stem", Map.of("age", "5", "facing", "up")),
         a("minecraft:pumpkin_stem", Map.of("age", "5", "facing", "west"))
      );
      a(
         1670,
         a("minecraft:pumpkin_stem", F),
         a("minecraft:pumpkin_stem", Map.of("age", "6", "facing", "east")),
         a("minecraft:pumpkin_stem", Map.of("age", "6", "facing", "north")),
         a("minecraft:pumpkin_stem", Map.of("age", "6", "facing", "south")),
         a("minecraft:pumpkin_stem", Map.of("age", "6", "facing", "up")),
         a("minecraft:pumpkin_stem", Map.of("age", "6", "facing", "west"))
      );
      a(
         1671,
         a("minecraft:pumpkin_stem", G),
         a("minecraft:pumpkin_stem", Map.of("age", "7", "facing", "east")),
         a("minecraft:pumpkin_stem", Map.of("age", "7", "facing", "north")),
         a("minecraft:pumpkin_stem", Map.of("age", "7", "facing", "south")),
         a("minecraft:pumpkin_stem", Map.of("age", "7", "facing", "up")),
         a("minecraft:pumpkin_stem", Map.of("age", "7", "facing", "west"))
      );
      a(
         1680,
         a("minecraft:melon_stem", h),
         a("minecraft:melon_stem", i),
         a("minecraft:melon_stem", j),
         a("minecraft:melon_stem", k),
         a("minecraft:melon_stem", Map.of("age", "0", "facing", "up")),
         a("minecraft:melon_stem", l)
      );
      a(
         1681,
         a("minecraft:melon_stem", m),
         a("minecraft:melon_stem", t),
         a("minecraft:melon_stem", u),
         a("minecraft:melon_stem", v),
         a("minecraft:melon_stem", Map.of("age", "1", "facing", "up")),
         a("minecraft:melon_stem", w)
      );
      a(
         1682,
         a("minecraft:melon_stem", x),
         a("minecraft:melon_stem", y),
         a("minecraft:melon_stem", z),
         a("minecraft:melon_stem", A),
         a("minecraft:melon_stem", Map.of("age", "2", "facing", "up")),
         a("minecraft:melon_stem", B)
      );
      a(
         1683,
         a("minecraft:melon_stem", C),
         a("minecraft:melon_stem", Map.of("age", "3", "facing", "east")),
         a("minecraft:melon_stem", Map.of("age", "3", "facing", "north")),
         a("minecraft:melon_stem", Map.of("age", "3", "facing", "south")),
         a("minecraft:melon_stem", Map.of("age", "3", "facing", "up")),
         a("minecraft:melon_stem", Map.of("age", "3", "facing", "west"))
      );
      a(
         1684,
         a("minecraft:melon_stem", D),
         a("minecraft:melon_stem", Map.of("age", "4", "facing", "east")),
         a("minecraft:melon_stem", Map.of("age", "4", "facing", "north")),
         a("minecraft:melon_stem", Map.of("age", "4", "facing", "south")),
         a("minecraft:melon_stem", Map.of("age", "4", "facing", "up")),
         a("minecraft:melon_stem", Map.of("age", "4", "facing", "west"))
      );
      a(
         1685,
         a("minecraft:melon_stem", E),
         a("minecraft:melon_stem", Map.of("age", "5", "facing", "east")),
         a("minecraft:melon_stem", Map.of("age", "5", "facing", "north")),
         a("minecraft:melon_stem", Map.of("age", "5", "facing", "south")),
         a("minecraft:melon_stem", Map.of("age", "5", "facing", "up")),
         a("minecraft:melon_stem", Map.of("age", "5", "facing", "west"))
      );
      a(
         1686,
         a("minecraft:melon_stem", F),
         a("minecraft:melon_stem", Map.of("age", "6", "facing", "east")),
         a("minecraft:melon_stem", Map.of("age", "6", "facing", "north")),
         a("minecraft:melon_stem", Map.of("age", "6", "facing", "south")),
         a("minecraft:melon_stem", Map.of("age", "6", "facing", "up")),
         a("minecraft:melon_stem", Map.of("age", "6", "facing", "west"))
      );
      a(
         1687,
         a("minecraft:melon_stem", G),
         a("minecraft:melon_stem", Map.of("age", "7", "facing", "east")),
         a("minecraft:melon_stem", Map.of("age", "7", "facing", "north")),
         a("minecraft:melon_stem", Map.of("age", "7", "facing", "south")),
         a("minecraft:melon_stem", Map.of("age", "7", "facing", "up")),
         a("minecraft:melon_stem", Map.of("age", "7", "facing", "west"))
      );
      a(
         1696,
         a("minecraft:vine", Map.of("east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:vine", gt),
         a("minecraft:vine", Map.of("east", "false", "north", "false", "south", "false", "up", "true", "west", "false"))
      );
      a(
         1697,
         a("minecraft:vine", Map.of("east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:vine", Map.of("east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:vine", Map.of("east", "false", "north", "false", "south", "true", "up", "true", "west", "false"))
      );
      a(
         1698,
         a("minecraft:vine", Map.of("east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:vine", Map.of("east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:vine", Map.of("east", "false", "north", "false", "south", "false", "up", "true", "west", "true"))
      );
      a(
         1699,
         a("minecraft:vine", Map.of("east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:vine", Map.of("east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:vine", Map.of("east", "false", "north", "false", "south", "true", "up", "true", "west", "true"))
      );
      a(
         1700,
         a("minecraft:vine", Map.of("east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:vine", Map.of("east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:vine", Map.of("east", "false", "north", "true", "south", "false", "up", "true", "west", "false"))
      );
      a(
         1701,
         a("minecraft:vine", Map.of("east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:vine", Map.of("east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:vine", Map.of("east", "false", "north", "true", "south", "true", "up", "true", "west", "false"))
      );
      a(
         1702,
         a("minecraft:vine", Map.of("east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:vine", Map.of("east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:vine", Map.of("east", "false", "north", "true", "south", "false", "up", "true", "west", "true"))
      );
      a(
         1703,
         a("minecraft:vine", Map.of("east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:vine", Map.of("east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:vine", Map.of("east", "false", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(
         1704,
         a("minecraft:vine", Map.of("east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:vine", Map.of("east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:vine", Map.of("east", "true", "north", "false", "south", "false", "up", "true", "west", "false"))
      );
      a(
         1705,
         a("minecraft:vine", Map.of("east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:vine", Map.of("east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:vine", Map.of("east", "true", "north", "false", "south", "true", "up", "true", "west", "false"))
      );
      a(
         1706,
         a("minecraft:vine", Map.of("east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:vine", Map.of("east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:vine", Map.of("east", "true", "north", "false", "south", "false", "up", "true", "west", "true"))
      );
      a(
         1707,
         a("minecraft:vine", Map.of("east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:vine", Map.of("east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:vine", Map.of("east", "true", "north", "false", "south", "true", "up", "true", "west", "true"))
      );
      a(
         1708,
         a("minecraft:vine", Map.of("east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:vine", Map.of("east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:vine", Map.of("east", "true", "north", "true", "south", "false", "up", "true", "west", "false"))
      );
      a(
         1709,
         a("minecraft:vine", Map.of("east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:vine", Map.of("east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:vine", Map.of("east", "true", "north", "true", "south", "true", "up", "true", "west", "false"))
      );
      a(
         1710,
         a("minecraft:vine", Map.of("east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:vine", Map.of("east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:vine", Map.of("east", "true", "north", "true", "south", "false", "up", "true", "west", "true"))
      );
      a(
         1711,
         a("minecraft:vine", Map.of("east", "true", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:vine", Map.of("east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:vine", Map.of("east", "true", "north", "true", "south", "true", "up", "true", "west", "true"))
      );
      a(1712, a("minecraft:oak_fence_gate", eo), a("minecraft:fence_gate", eo), a("minecraft:fence_gate", ew));
      a(1713, a("minecraft:oak_fence_gate", ep), a("minecraft:fence_gate", ep), a("minecraft:fence_gate", ex));
      a(1714, a("minecraft:oak_fence_gate", en), a("minecraft:fence_gate", en), a("minecraft:fence_gate", ev));
      a(1715, a("minecraft:oak_fence_gate", em), a("minecraft:fence_gate", em), a("minecraft:fence_gate", eu));
      a(1716, a("minecraft:oak_fence_gate", es), a("minecraft:fence_gate", es), a("minecraft:fence_gate", eA));
      a(1717, a("minecraft:oak_fence_gate", et), a("minecraft:fence_gate", et), a("minecraft:fence_gate", eB));
      a(1718, a("minecraft:oak_fence_gate", er), a("minecraft:fence_gate", er), a("minecraft:fence_gate", ez));
      a(1719, a("minecraft:oak_fence_gate", eq), a("minecraft:fence_gate", eq), a("minecraft:fence_gate", ey));
      a(1720, a("minecraft:oak_fence_gate", eN), a("minecraft:fence_gate", eN), a("minecraft:fence_gate", eV));
      a(1721, a("minecraft:oak_fence_gate", eO), a("minecraft:fence_gate", eO), a("minecraft:fence_gate", eW));
      a(1722, a("minecraft:oak_fence_gate", eM), a("minecraft:fence_gate", eM), a("minecraft:fence_gate", eU));
      a(1723, a("minecraft:oak_fence_gate", eL), a("minecraft:fence_gate", eL), a("minecraft:fence_gate", eT));
      a(1724, a("minecraft:oak_fence_gate", eR), a("minecraft:fence_gate", eR), a("minecraft:fence_gate", eZ));
      a(1725, a("minecraft:oak_fence_gate", eS), a("minecraft:fence_gate", eS), a("minecraft:fence_gate", fa));
      a(1726, a("minecraft:oak_fence_gate", eQ), a("minecraft:fence_gate", eQ), a("minecraft:fence_gate", eY));
      a(1727, a("minecraft:oak_fence_gate", eP), a("minecraft:fence_gate", eP), a("minecraft:fence_gate", eX));
      a(
         1728,
         a("minecraft:brick_stairs", cZ),
         a("minecraft:brick_stairs", cJ),
         a("minecraft:brick_stairs", cN),
         a("minecraft:brick_stairs", cR),
         a("minecraft:brick_stairs", cV),
         a("minecraft:brick_stairs", cZ)
      );
      a(
         1729,
         a("minecraft:brick_stairs", dc),
         a("minecraft:brick_stairs", cM),
         a("minecraft:brick_stairs", cQ),
         a("minecraft:brick_stairs", cU),
         a("minecraft:brick_stairs", cY),
         a("minecraft:brick_stairs", dc)
      );
      a(
         1730,
         a("minecraft:brick_stairs", db),
         a("minecraft:brick_stairs", cL),
         a("minecraft:brick_stairs", cP),
         a("minecraft:brick_stairs", cT),
         a("minecraft:brick_stairs", cX),
         a("minecraft:brick_stairs", db)
      );
      a(
         1731,
         a("minecraft:brick_stairs", da),
         a("minecraft:brick_stairs", cK),
         a("minecraft:brick_stairs", cO),
         a("minecraft:brick_stairs", cS),
         a("minecraft:brick_stairs", cW),
         a("minecraft:brick_stairs", da)
      );
      a(
         1732,
         a("minecraft:brick_stairs", dC),
         a("minecraft:brick_stairs", dm),
         a("minecraft:brick_stairs", dq),
         a("minecraft:brick_stairs", du),
         a("minecraft:brick_stairs", dy),
         a("minecraft:brick_stairs", dC)
      );
      a(
         1733,
         a("minecraft:brick_stairs", dF),
         a("minecraft:brick_stairs", dp),
         a("minecraft:brick_stairs", dt),
         a("minecraft:brick_stairs", dx),
         a("minecraft:brick_stairs", dB),
         a("minecraft:brick_stairs", dF)
      );
      a(
         1734,
         a("minecraft:brick_stairs", dE),
         a("minecraft:brick_stairs", do),
         a("minecraft:brick_stairs", ds),
         a("minecraft:brick_stairs", dw),
         a("minecraft:brick_stairs", dA),
         a("minecraft:brick_stairs", dE)
      );
      a(
         1735,
         a("minecraft:brick_stairs", dD),
         a("minecraft:brick_stairs", dn),
         a("minecraft:brick_stairs", dr),
         a("minecraft:brick_stairs", dv),
         a("minecraft:brick_stairs", dz),
         a("minecraft:brick_stairs", dD)
      );
      a(
         1744,
         a("minecraft:stone_brick_stairs", cZ),
         a("minecraft:stone_brick_stairs", cJ),
         a("minecraft:stone_brick_stairs", cN),
         a("minecraft:stone_brick_stairs", cR),
         a("minecraft:stone_brick_stairs", cV),
         a("minecraft:stone_brick_stairs", cZ)
      );
      a(
         1745,
         a("minecraft:stone_brick_stairs", dc),
         a("minecraft:stone_brick_stairs", cM),
         a("minecraft:stone_brick_stairs", cQ),
         a("minecraft:stone_brick_stairs", cU),
         a("minecraft:stone_brick_stairs", cY),
         a("minecraft:stone_brick_stairs", dc)
      );
      a(
         1746,
         a("minecraft:stone_brick_stairs", db),
         a("minecraft:stone_brick_stairs", cL),
         a("minecraft:stone_brick_stairs", cP),
         a("minecraft:stone_brick_stairs", cT),
         a("minecraft:stone_brick_stairs", cX),
         a("minecraft:stone_brick_stairs", db)
      );
      a(
         1747,
         a("minecraft:stone_brick_stairs", da),
         a("minecraft:stone_brick_stairs", cK),
         a("minecraft:stone_brick_stairs", cO),
         a("minecraft:stone_brick_stairs", cS),
         a("minecraft:stone_brick_stairs", cW),
         a("minecraft:stone_brick_stairs", da)
      );
      a(
         1748,
         a("minecraft:stone_brick_stairs", dC),
         a("minecraft:stone_brick_stairs", dm),
         a("minecraft:stone_brick_stairs", dq),
         a("minecraft:stone_brick_stairs", du),
         a("minecraft:stone_brick_stairs", dy),
         a("minecraft:stone_brick_stairs", dC)
      );
      a(
         1749,
         a("minecraft:stone_brick_stairs", dF),
         a("minecraft:stone_brick_stairs", dp),
         a("minecraft:stone_brick_stairs", dt),
         a("minecraft:stone_brick_stairs", dx),
         a("minecraft:stone_brick_stairs", dB),
         a("minecraft:stone_brick_stairs", dF)
      );
      a(
         1750,
         a("minecraft:stone_brick_stairs", dE),
         a("minecraft:stone_brick_stairs", do),
         a("minecraft:stone_brick_stairs", ds),
         a("minecraft:stone_brick_stairs", dw),
         a("minecraft:stone_brick_stairs", dA),
         a("minecraft:stone_brick_stairs", dE)
      );
      a(
         1751,
         a("minecraft:stone_brick_stairs", dD),
         a("minecraft:stone_brick_stairs", dn),
         a("minecraft:stone_brick_stairs", dr),
         a("minecraft:stone_brick_stairs", dv),
         a("minecraft:stone_brick_stairs", dz),
         a("minecraft:stone_brick_stairs", dD)
      );
      a(1760, a("minecraft:mycelium", gb), a("minecraft:mycelium", gb), a("minecraft:mycelium", Map.of("snowy", "true")));
      a(1776, b("minecraft:lily_pad"), b("minecraft:waterlily"));
   }

   private static void j() {
      a(1792, b("minecraft:nether_bricks"), b("minecraft:nether_brick"));
      a(
         1808,
         a("minecraft:nether_brick_fence", gu),
         a("minecraft:nether_brick_fence", gu),
         a("minecraft:nether_brick_fence", gC),
         a("minecraft:nether_brick_fence", gw),
         a("minecraft:nether_brick_fence", gE),
         a("minecraft:nether_brick_fence", gy),
         a("minecraft:nether_brick_fence", gG),
         a("minecraft:nether_brick_fence", gA),
         a("minecraft:nether_brick_fence", gI),
         a("minecraft:nether_brick_fence", gv),
         a("minecraft:nether_brick_fence", gD),
         a("minecraft:nether_brick_fence", gx),
         a("minecraft:nether_brick_fence", gF),
         a("minecraft:nether_brick_fence", gz),
         a("minecraft:nether_brick_fence", gH),
         a("minecraft:nether_brick_fence", gB),
         a("minecraft:nether_brick_fence", gJ)
      );
      a(
         1824,
         a("minecraft:nether_brick_stairs", cZ),
         a("minecraft:nether_brick_stairs", cJ),
         a("minecraft:nether_brick_stairs", cN),
         a("minecraft:nether_brick_stairs", cR),
         a("minecraft:nether_brick_stairs", cV),
         a("minecraft:nether_brick_stairs", cZ)
      );
      a(
         1825,
         a("minecraft:nether_brick_stairs", dc),
         a("minecraft:nether_brick_stairs", cM),
         a("minecraft:nether_brick_stairs", cQ),
         a("minecraft:nether_brick_stairs", cU),
         a("minecraft:nether_brick_stairs", cY),
         a("minecraft:nether_brick_stairs", dc)
      );
      a(
         1826,
         a("minecraft:nether_brick_stairs", db),
         a("minecraft:nether_brick_stairs", cL),
         a("minecraft:nether_brick_stairs", cP),
         a("minecraft:nether_brick_stairs", cT),
         a("minecraft:nether_brick_stairs", cX),
         a("minecraft:nether_brick_stairs", db)
      );
      a(
         1827,
         a("minecraft:nether_brick_stairs", da),
         a("minecraft:nether_brick_stairs", cK),
         a("minecraft:nether_brick_stairs", cO),
         a("minecraft:nether_brick_stairs", cS),
         a("minecraft:nether_brick_stairs", cW),
         a("minecraft:nether_brick_stairs", da)
      );
      a(
         1828,
         a("minecraft:nether_brick_stairs", dC),
         a("minecraft:nether_brick_stairs", dm),
         a("minecraft:nether_brick_stairs", dq),
         a("minecraft:nether_brick_stairs", du),
         a("minecraft:nether_brick_stairs", dy),
         a("minecraft:nether_brick_stairs", dC)
      );
      a(
         1829,
         a("minecraft:nether_brick_stairs", dF),
         a("minecraft:nether_brick_stairs", dp),
         a("minecraft:nether_brick_stairs", dt),
         a("minecraft:nether_brick_stairs", dx),
         a("minecraft:nether_brick_stairs", dB),
         a("minecraft:nether_brick_stairs", dF)
      );
      a(
         1830,
         a("minecraft:nether_brick_stairs", dE),
         a("minecraft:nether_brick_stairs", do),
         a("minecraft:nether_brick_stairs", ds),
         a("minecraft:nether_brick_stairs", dw),
         a("minecraft:nether_brick_stairs", dA),
         a("minecraft:nether_brick_stairs", dE)
      );
      a(
         1831,
         a("minecraft:nether_brick_stairs", dD),
         a("minecraft:nether_brick_stairs", dn),
         a("minecraft:nether_brick_stairs", dr),
         a("minecraft:nether_brick_stairs", dv),
         a("minecraft:nether_brick_stairs", dz),
         a("minecraft:nether_brick_stairs", dD)
      );
      a(1840, a("minecraft:nether_wart", h), a("minecraft:nether_wart", h));
      a(1841, a("minecraft:nether_wart", m), a("minecraft:nether_wart", m));
      a(1842, a("minecraft:nether_wart", x), a("minecraft:nether_wart", x));
      a(1843, a("minecraft:nether_wart", C), a("minecraft:nether_wart", C));
      a(1856, b("minecraft:enchanting_table"), b("minecraft:enchanting_table"));
      a(
         1872,
         a("minecraft:brewing_stand", Map.of("has_bottle_0", "false", "has_bottle_1", "false", "has_bottle_2", "false")),
         a("minecraft:brewing_stand", Map.of("has_bottle_0", "false", "has_bottle_1", "false", "has_bottle_2", "false"))
      );
      a(
         1873,
         a("minecraft:brewing_stand", Map.of("has_bottle_0", "true", "has_bottle_1", "false", "has_bottle_2", "false")),
         a("minecraft:brewing_stand", Map.of("has_bottle_0", "true", "has_bottle_1", "false", "has_bottle_2", "false"))
      );
      a(
         1874,
         a("minecraft:brewing_stand", Map.of("has_bottle_0", "false", "has_bottle_1", "true", "has_bottle_2", "false")),
         a("minecraft:brewing_stand", Map.of("has_bottle_0", "false", "has_bottle_1", "true", "has_bottle_2", "false"))
      );
      a(
         1875,
         a("minecraft:brewing_stand", Map.of("has_bottle_0", "true", "has_bottle_1", "true", "has_bottle_2", "false")),
         a("minecraft:brewing_stand", Map.of("has_bottle_0", "true", "has_bottle_1", "true", "has_bottle_2", "false"))
      );
      a(
         1876,
         a("minecraft:brewing_stand", Map.of("has_bottle_0", "false", "has_bottle_1", "false", "has_bottle_2", "true")),
         a("minecraft:brewing_stand", Map.of("has_bottle_0", "false", "has_bottle_1", "false", "has_bottle_2", "true"))
      );
      a(
         1877,
         a("minecraft:brewing_stand", Map.of("has_bottle_0", "true", "has_bottle_1", "false", "has_bottle_2", "true")),
         a("minecraft:brewing_stand", Map.of("has_bottle_0", "true", "has_bottle_1", "false", "has_bottle_2", "true"))
      );
      a(
         1878,
         a("minecraft:brewing_stand", Map.of("has_bottle_0", "false", "has_bottle_1", "true", "has_bottle_2", "true")),
         a("minecraft:brewing_stand", Map.of("has_bottle_0", "false", "has_bottle_1", "true", "has_bottle_2", "true"))
      );
      a(
         1879,
         a("minecraft:brewing_stand", Map.of("has_bottle_0", "true", "has_bottle_1", "true", "has_bottle_2", "true")),
         a("minecraft:brewing_stand", Map.of("has_bottle_0", "true", "has_bottle_1", "true", "has_bottle_2", "true"))
      );
      a(1888, a("minecraft:cauldron", dH), a("minecraft:cauldron", dH));
      a(1889, a("minecraft:cauldron", dI), a("minecraft:cauldron", dI));
      a(1890, a("minecraft:cauldron", dP), a("minecraft:cauldron", dP));
      a(1891, a("minecraft:cauldron", dQ), a("minecraft:cauldron", dQ));
      a(1904, b("minecraft:end_portal"), b("minecraft:end_portal"));
      a(
         1920,
         a("minecraft:end_portal_frame", Map.of("eye", "false", "facing", "south")),
         a("minecraft:end_portal_frame", Map.of("eye", "false", "facing", "south"))
      );
      a(
         1921,
         a("minecraft:end_portal_frame", Map.of("eye", "false", "facing", "west")),
         a("minecraft:end_portal_frame", Map.of("eye", "false", "facing", "west"))
      );
      a(
         1922,
         a("minecraft:end_portal_frame", Map.of("eye", "false", "facing", "north")),
         a("minecraft:end_portal_frame", Map.of("eye", "false", "facing", "north"))
      );
      a(
         1923,
         a("minecraft:end_portal_frame", Map.of("eye", "false", "facing", "east")),
         a("minecraft:end_portal_frame", Map.of("eye", "false", "facing", "east"))
      );
      a(
         1924,
         a("minecraft:end_portal_frame", Map.of("eye", "true", "facing", "south")),
         a("minecraft:end_portal_frame", Map.of("eye", "true", "facing", "south"))
      );
      a(
         1925,
         a("minecraft:end_portal_frame", Map.of("eye", "true", "facing", "west")),
         a("minecraft:end_portal_frame", Map.of("eye", "true", "facing", "west"))
      );
      a(
         1926,
         a("minecraft:end_portal_frame", Map.of("eye", "true", "facing", "north")),
         a("minecraft:end_portal_frame", Map.of("eye", "true", "facing", "north"))
      );
      a(
         1927,
         a("minecraft:end_portal_frame", Map.of("eye", "true", "facing", "east")),
         a("minecraft:end_portal_frame", Map.of("eye", "true", "facing", "east"))
      );
      a(1936, b("minecraft:end_stone"), b("minecraft:end_stone"));
      a(1952, b("minecraft:dragon_egg"), b("minecraft:dragon_egg"));
      a(1968, a("minecraft:redstone_lamp", dX), b("minecraft:redstone_lamp"));
      a(1984, a("minecraft:redstone_lamp", dY), b("minecraft:lit_redstone_lamp"));
      a(2000, a("minecraft:oak_slab", gr), a("minecraft:double_wooden_slab", Map.of("variant", "oak")));
      a(2001, a("minecraft:spruce_slab", gr), a("minecraft:double_wooden_slab", Map.of("variant", "spruce")));
      a(2002, a("minecraft:birch_slab", gr), a("minecraft:double_wooden_slab", Map.of("variant", "birch")));
      a(2003, a("minecraft:jungle_slab", gr), a("minecraft:double_wooden_slab", Map.of("variant", "jungle")));
      a(2004, a("minecraft:acacia_slab", gr), a("minecraft:double_wooden_slab", Map.of("variant", "acacia")));
      a(2005, a("minecraft:dark_oak_slab", gr), a("minecraft:double_wooden_slab", Map.of("variant", "dark_oak")));
      a(2016, a("minecraft:oak_slab", gq), a("minecraft:wooden_slab", Map.of("half", "bottom", "variant", "oak")));
      a(2017, a("minecraft:spruce_slab", gq), a("minecraft:wooden_slab", Map.of("half", "bottom", "variant", "spruce")));
      a(2018, a("minecraft:birch_slab", gq), a("minecraft:wooden_slab", Map.of("half", "bottom", "variant", "birch")));
      a(2019, a("minecraft:jungle_slab", gq), a("minecraft:wooden_slab", Map.of("half", "bottom", "variant", "jungle")));
      a(2020, a("minecraft:acacia_slab", gq), a("minecraft:wooden_slab", Map.of("half", "bottom", "variant", "acacia")));
      a(2021, a("minecraft:dark_oak_slab", gq), a("minecraft:wooden_slab", Map.of("half", "bottom", "variant", "dark_oak")));
      a(2024, a("minecraft:oak_slab", gs), a("minecraft:wooden_slab", Map.of("half", "top", "variant", "oak")));
      a(2025, a("minecraft:spruce_slab", gs), a("minecraft:wooden_slab", Map.of("half", "top", "variant", "spruce")));
      a(2026, a("minecraft:birch_slab", gs), a("minecraft:wooden_slab", Map.of("half", "top", "variant", "birch")));
      a(2027, a("minecraft:jungle_slab", gs), a("minecraft:wooden_slab", Map.of("half", "top", "variant", "jungle")));
      a(2028, a("minecraft:acacia_slab", gs), a("minecraft:wooden_slab", Map.of("half", "top", "variant", "acacia")));
      a(2029, a("minecraft:dark_oak_slab", gs), a("minecraft:wooden_slab", Map.of("half", "top", "variant", "dark_oak")));
      a(2032, a("minecraft:cocoa", k), a("minecraft:cocoa", k));
      a(2033, a("minecraft:cocoa", l), a("minecraft:cocoa", l));
      a(2034, a("minecraft:cocoa", j), a("minecraft:cocoa", j));
      a(2035, a("minecraft:cocoa", i), a("minecraft:cocoa", i));
      a(2036, a("minecraft:cocoa", v), a("minecraft:cocoa", v));
      a(2037, a("minecraft:cocoa", w), a("minecraft:cocoa", w));
      a(2038, a("minecraft:cocoa", u), a("minecraft:cocoa", u));
      a(2039, a("minecraft:cocoa", t), a("minecraft:cocoa", t));
      a(2040, a("minecraft:cocoa", A), a("minecraft:cocoa", A));
      a(2041, a("minecraft:cocoa", B), a("minecraft:cocoa", B));
      a(2042, a("minecraft:cocoa", z), a("minecraft:cocoa", z));
      a(2043, a("minecraft:cocoa", y), a("minecraft:cocoa", y));
   }

   private static void k() {
      a(
         2048,
         a("minecraft:sandstone_stairs", cZ),
         a("minecraft:sandstone_stairs", cJ),
         a("minecraft:sandstone_stairs", cN),
         a("minecraft:sandstone_stairs", cR),
         a("minecraft:sandstone_stairs", cV),
         a("minecraft:sandstone_stairs", cZ)
      );
      a(
         2049,
         a("minecraft:sandstone_stairs", dc),
         a("minecraft:sandstone_stairs", cM),
         a("minecraft:sandstone_stairs", cQ),
         a("minecraft:sandstone_stairs", cU),
         a("minecraft:sandstone_stairs", cY),
         a("minecraft:sandstone_stairs", dc)
      );
      a(
         2050,
         a("minecraft:sandstone_stairs", db),
         a("minecraft:sandstone_stairs", cL),
         a("minecraft:sandstone_stairs", cP),
         a("minecraft:sandstone_stairs", cT),
         a("minecraft:sandstone_stairs", cX),
         a("minecraft:sandstone_stairs", db)
      );
      a(
         2051,
         a("minecraft:sandstone_stairs", da),
         a("minecraft:sandstone_stairs", cK),
         a("minecraft:sandstone_stairs", cO),
         a("minecraft:sandstone_stairs", cS),
         a("minecraft:sandstone_stairs", cW),
         a("minecraft:sandstone_stairs", da)
      );
      a(
         2052,
         a("minecraft:sandstone_stairs", dC),
         a("minecraft:sandstone_stairs", dm),
         a("minecraft:sandstone_stairs", dq),
         a("minecraft:sandstone_stairs", du),
         a("minecraft:sandstone_stairs", dy),
         a("minecraft:sandstone_stairs", dC)
      );
      a(
         2053,
         a("minecraft:sandstone_stairs", dF),
         a("minecraft:sandstone_stairs", dp),
         a("minecraft:sandstone_stairs", dt),
         a("minecraft:sandstone_stairs", dx),
         a("minecraft:sandstone_stairs", dB),
         a("minecraft:sandstone_stairs", dF)
      );
      a(
         2054,
         a("minecraft:sandstone_stairs", dE),
         a("minecraft:sandstone_stairs", do),
         a("minecraft:sandstone_stairs", ds),
         a("minecraft:sandstone_stairs", dw),
         a("minecraft:sandstone_stairs", dA),
         a("minecraft:sandstone_stairs", dE)
      );
      a(
         2055,
         a("minecraft:sandstone_stairs", dD),
         a("minecraft:sandstone_stairs", dn),
         a("minecraft:sandstone_stairs", dr),
         a("minecraft:sandstone_stairs", dv),
         a("minecraft:sandstone_stairs", dz),
         a("minecraft:sandstone_stairs", dD)
      );
      a(2064, b("minecraft:emerald_ore"), b("minecraft:emerald_ore"));
      a(2082, a("minecraft:ender_chest", bd), a("minecraft:ender_chest", bd));
      a(2083, a("minecraft:ender_chest", bA), a("minecraft:ender_chest", bA));
      a(2084, a("minecraft:ender_chest", ce), a("minecraft:ender_chest", ce));
      a(2085, a("minecraft:ender_chest", aG), a("minecraft:ender_chest", aG));
      a(
         2096,
         a("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "south", "powered", "false")),
         a("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "south", "powered", "false"))
      );
      a(
         2097,
         a("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "west", "powered", "false")),
         a("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "west", "powered", "false"))
      );
      a(
         2098,
         a("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "north", "powered", "false")),
         a("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "north", "powered", "false"))
      );
      a(
         2099,
         a("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "east", "powered", "false")),
         a("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "east", "powered", "false"))
      );
      a(
         2100,
         a("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "south", "powered", "false")),
         a("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "south", "powered", "false"))
      );
      a(
         2101,
         a("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "west", "powered", "false")),
         a("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "west", "powered", "false"))
      );
      a(
         2102,
         a("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "north", "powered", "false")),
         a("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "north", "powered", "false"))
      );
      a(
         2103,
         a("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "east", "powered", "false")),
         a("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "east", "powered", "false"))
      );
      a(
         2104,
         a("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "south", "powered", "true")),
         a("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "south", "powered", "true"))
      );
      a(
         2105,
         a("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "west", "powered", "true")),
         a("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "west", "powered", "true"))
      );
      a(
         2106,
         a("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "north", "powered", "true")),
         a("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "north", "powered", "true"))
      );
      a(
         2107,
         a("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "east", "powered", "true")),
         a("minecraft:tripwire_hook", Map.of("attached", "false", "facing", "east", "powered", "true"))
      );
      a(
         2108,
         a("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "south", "powered", "true")),
         a("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "south", "powered", "true"))
      );
      a(
         2109,
         a("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "west", "powered", "true")),
         a("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "west", "powered", "true"))
      );
      a(
         2110,
         a("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "north", "powered", "true")),
         a("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "north", "powered", "true"))
      );
      a(
         2111,
         a("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "east", "powered", "true")),
         a("minecraft:tripwire_hook", Map.of("attached", "true", "facing", "east", "powered", "true"))
      );
      a(
         2112,
         a("minecraft:tripwire", ag),
         a("minecraft:tripwire", ag),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "false", "powered", "false", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "false", "powered", "false", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "false", "powered", "false", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "true", "powered", "false", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "true", "powered", "false", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "true", "powered", "false", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "true", "powered", "false", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "false", "powered", "false", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "false", "powered", "false", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "false", "powered", "false", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "false", "powered", "false", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "true", "powered", "false", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "true", "powered", "false", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "true", "powered", "false", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "true", "powered", "false", "south", "true", "west", "true")
         )
      );
      a(
         2113,
         a("minecraft:tripwire", ah),
         a("minecraft:tripwire", ah),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "false", "powered", "true", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "false", "powered", "true", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "true", "powered", "true", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "true", "powered", "true", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "true", "powered", "true", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "false", "north", "true", "powered", "true", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "false", "powered", "true", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "false", "powered", "true", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "false", "powered", "true", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "false", "powered", "true", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "true", "powered", "true", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "true", "powered", "true", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "true", "powered", "true", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "false", "east", "true", "north", "true", "powered", "true", "south", "true", "west", "true")
         )
      );
      a(2114, a("minecraft:tripwire", ag));
      a(2115, a("minecraft:tripwire", ah));
      a(
         2116,
         a("minecraft:tripwire", ak),
         a("minecraft:tripwire", ak),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "false", "powered", "false", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "false", "powered", "false", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "false", "powered", "false", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "true", "powered", "false", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "true", "powered", "false", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "true", "powered", "false", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "true", "powered", "false", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "false", "powered", "false", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "false", "powered", "false", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "false", "powered", "false", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "false", "powered", "false", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "true", "powered", "false", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "true", "powered", "false", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "true", "powered", "false", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "true", "powered", "false", "south", "true", "west", "true")
         )
      );
      a(
         2117,
         a("minecraft:tripwire", al),
         a("minecraft:tripwire", al),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "false", "powered", "true", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "false", "powered", "true", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "true", "powered", "true", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "true", "powered", "true", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "true", "powered", "true", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "false", "north", "true", "powered", "true", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "false", "powered", "true", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "false", "powered", "true", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "false", "powered", "true", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "false", "powered", "true", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "true", "powered", "true", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "true", "powered", "true", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "true", "powered", "true", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "false", "east", "true", "north", "true", "powered", "true", "south", "true", "west", "true")
         )
      );
      a(2118, a("minecraft:tripwire", ak));
      a(2119, a("minecraft:tripwire", al));
      a(
         2120,
         a("minecraft:tripwire", ai),
         a("minecraft:tripwire", ai),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "false", "powered", "false", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "false", "powered", "false", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "false", "powered", "false", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "true", "powered", "false", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "true", "powered", "false", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "true", "powered", "false", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "true", "powered", "false", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "false", "powered", "false", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "false", "powered", "false", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "false", "powered", "false", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "false", "powered", "false", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "true", "powered", "false", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "true", "powered", "false", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "true", "powered", "false", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "true", "powered", "false", "south", "true", "west", "true")
         )
      );
      a(
         2121,
         a("minecraft:tripwire", aj),
         a("minecraft:tripwire", aj),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "true", "powered", "true", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "true", "powered", "true", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "true", "powered", "true", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "false", "north", "true", "powered", "true", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "false", "powered", "true", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "false", "powered", "true", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "false", "powered", "true", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "false", "powered", "true", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "true", "powered", "true", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "true", "powered", "true", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "true", "powered", "true", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "false", "disarmed", "true", "east", "true", "north", "true", "powered", "true", "south", "true", "west", "true")
         )
      );
      a(2122, a("minecraft:tripwire", ai));
      a(2123, a("minecraft:tripwire", aj));
      a(
         2124,
         a("minecraft:tripwire", am),
         a("minecraft:tripwire", am),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "false", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "false", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "false", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "true", "powered", "false", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "true", "powered", "false", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "true", "powered", "false", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "true", "powered", "false", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "false", "powered", "false", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "false", "powered", "false", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "false", "powered", "false", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "false", "powered", "false", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "true", "powered", "false", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "true", "powered", "false", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "true", "powered", "false", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "true", "powered", "false", "south", "true", "west", "true")
         )
      );
      a(
         2125,
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "false", "powered", "true", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "true", "powered", "true", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "true", "powered", "true", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "true", "powered", "true", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "false", "north", "true", "powered", "true", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "false", "powered", "true", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "false", "powered", "true", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "false", "powered", "true", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "false", "powered", "true", "south", "true", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "true", "powered", "true", "south", "false", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "true", "powered", "true", "south", "false", "west", "true")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "true", "powered", "true", "south", "true", "west", "false")
         ),
         a(
            "minecraft:tripwire",
            Map.of("attached", "true", "disarmed", "true", "east", "true", "north", "true", "powered", "true", "south", "true", "west", "true")
         )
      );
      a(2126, a("minecraft:tripwire", am));
      a(2128, b("minecraft:emerald_block"), b("minecraft:emerald_block"));
      a(
         2144,
         a("minecraft:spruce_stairs", cZ),
         a("minecraft:spruce_stairs", cJ),
         a("minecraft:spruce_stairs", cN),
         a("minecraft:spruce_stairs", cR),
         a("minecraft:spruce_stairs", cV),
         a("minecraft:spruce_stairs", cZ)
      );
      a(
         2145,
         a("minecraft:spruce_stairs", dc),
         a("minecraft:spruce_stairs", cM),
         a("minecraft:spruce_stairs", cQ),
         a("minecraft:spruce_stairs", cU),
         a("minecraft:spruce_stairs", cY),
         a("minecraft:spruce_stairs", dc)
      );
      a(
         2146,
         a("minecraft:spruce_stairs", db),
         a("minecraft:spruce_stairs", cL),
         a("minecraft:spruce_stairs", cP),
         a("minecraft:spruce_stairs", cT),
         a("minecraft:spruce_stairs", cX),
         a("minecraft:spruce_stairs", db)
      );
      a(
         2147,
         a("minecraft:spruce_stairs", da),
         a("minecraft:spruce_stairs", cK),
         a("minecraft:spruce_stairs", cO),
         a("minecraft:spruce_stairs", cS),
         a("minecraft:spruce_stairs", cW),
         a("minecraft:spruce_stairs", da)
      );
      a(
         2148,
         a("minecraft:spruce_stairs", dC),
         a("minecraft:spruce_stairs", dm),
         a("minecraft:spruce_stairs", dq),
         a("minecraft:spruce_stairs", du),
         a("minecraft:spruce_stairs", dy),
         a("minecraft:spruce_stairs", dC)
      );
      a(
         2149,
         a("minecraft:spruce_stairs", dF),
         a("minecraft:spruce_stairs", dp),
         a("minecraft:spruce_stairs", dt),
         a("minecraft:spruce_stairs", dx),
         a("minecraft:spruce_stairs", dB),
         a("minecraft:spruce_stairs", dF)
      );
      a(
         2150,
         a("minecraft:spruce_stairs", dE),
         a("minecraft:spruce_stairs", do),
         a("minecraft:spruce_stairs", ds),
         a("minecraft:spruce_stairs", dw),
         a("minecraft:spruce_stairs", dA),
         a("minecraft:spruce_stairs", dE)
      );
      a(
         2151,
         a("minecraft:spruce_stairs", dD),
         a("minecraft:spruce_stairs", dn),
         a("minecraft:spruce_stairs", dr),
         a("minecraft:spruce_stairs", dv),
         a("minecraft:spruce_stairs", dz),
         a("minecraft:spruce_stairs", dD)
      );
      a(
         2160,
         a("minecraft:birch_stairs", cZ),
         a("minecraft:birch_stairs", cJ),
         a("minecraft:birch_stairs", cN),
         a("minecraft:birch_stairs", cR),
         a("minecraft:birch_stairs", cV),
         a("minecraft:birch_stairs", cZ)
      );
      a(
         2161,
         a("minecraft:birch_stairs", dc),
         a("minecraft:birch_stairs", cM),
         a("minecraft:birch_stairs", cQ),
         a("minecraft:birch_stairs", cU),
         a("minecraft:birch_stairs", cY),
         a("minecraft:birch_stairs", dc)
      );
      a(
         2162,
         a("minecraft:birch_stairs", db),
         a("minecraft:birch_stairs", cL),
         a("minecraft:birch_stairs", cP),
         a("minecraft:birch_stairs", cT),
         a("minecraft:birch_stairs", cX),
         a("minecraft:birch_stairs", db)
      );
      a(
         2163,
         a("minecraft:birch_stairs", da),
         a("minecraft:birch_stairs", cK),
         a("minecraft:birch_stairs", cO),
         a("minecraft:birch_stairs", cS),
         a("minecraft:birch_stairs", cW),
         a("minecraft:birch_stairs", da)
      );
      a(
         2164,
         a("minecraft:birch_stairs", dC),
         a("minecraft:birch_stairs", dm),
         a("minecraft:birch_stairs", dq),
         a("minecraft:birch_stairs", du),
         a("minecraft:birch_stairs", dy),
         a("minecraft:birch_stairs", dC)
      );
      a(
         2165,
         a("minecraft:birch_stairs", dF),
         a("minecraft:birch_stairs", dp),
         a("minecraft:birch_stairs", dt),
         a("minecraft:birch_stairs", dx),
         a("minecraft:birch_stairs", dB),
         a("minecraft:birch_stairs", dF)
      );
      a(
         2166,
         a("minecraft:birch_stairs", dE),
         a("minecraft:birch_stairs", do),
         a("minecraft:birch_stairs", ds),
         a("minecraft:birch_stairs", dw),
         a("minecraft:birch_stairs", dA),
         a("minecraft:birch_stairs", dE)
      );
      a(
         2167,
         a("minecraft:birch_stairs", dD),
         a("minecraft:birch_stairs", dn),
         a("minecraft:birch_stairs", dr),
         a("minecraft:birch_stairs", dv),
         a("minecraft:birch_stairs", dz),
         a("minecraft:birch_stairs", dD)
      );
      a(
         2176,
         a("minecraft:jungle_stairs", cZ),
         a("minecraft:jungle_stairs", cJ),
         a("minecraft:jungle_stairs", cN),
         a("minecraft:jungle_stairs", cR),
         a("minecraft:jungle_stairs", cV),
         a("minecraft:jungle_stairs", cZ)
      );
      a(
         2177,
         a("minecraft:jungle_stairs", dc),
         a("minecraft:jungle_stairs", cM),
         a("minecraft:jungle_stairs", cQ),
         a("minecraft:jungle_stairs", cU),
         a("minecraft:jungle_stairs", cY),
         a("minecraft:jungle_stairs", dc)
      );
      a(
         2178,
         a("minecraft:jungle_stairs", db),
         a("minecraft:jungle_stairs", cL),
         a("minecraft:jungle_stairs", cP),
         a("minecraft:jungle_stairs", cT),
         a("minecraft:jungle_stairs", cX),
         a("minecraft:jungle_stairs", db)
      );
      a(
         2179,
         a("minecraft:jungle_stairs", da),
         a("minecraft:jungle_stairs", cK),
         a("minecraft:jungle_stairs", cO),
         a("minecraft:jungle_stairs", cS),
         a("minecraft:jungle_stairs", cW),
         a("minecraft:jungle_stairs", da)
      );
      a(
         2180,
         a("minecraft:jungle_stairs", dC),
         a("minecraft:jungle_stairs", dm),
         a("minecraft:jungle_stairs", dq),
         a("minecraft:jungle_stairs", du),
         a("minecraft:jungle_stairs", dy),
         a("minecraft:jungle_stairs", dC)
      );
      a(
         2181,
         a("minecraft:jungle_stairs", dF),
         a("minecraft:jungle_stairs", dp),
         a("minecraft:jungle_stairs", dt),
         a("minecraft:jungle_stairs", dx),
         a("minecraft:jungle_stairs", dB),
         a("minecraft:jungle_stairs", dF)
      );
      a(
         2182,
         a("minecraft:jungle_stairs", dE),
         a("minecraft:jungle_stairs", do),
         a("minecraft:jungle_stairs", ds),
         a("minecraft:jungle_stairs", dw),
         a("minecraft:jungle_stairs", dA),
         a("minecraft:jungle_stairs", dE)
      );
      a(
         2183,
         a("minecraft:jungle_stairs", dD),
         a("minecraft:jungle_stairs", dn),
         a("minecraft:jungle_stairs", dr),
         a("minecraft:jungle_stairs", dv),
         a("minecraft:jungle_stairs", dz),
         a("minecraft:jungle_stairs", dD)
      );
      a(2192, a("minecraft:command_block", aA), a("minecraft:command_block", aA));
      a(2193, a("minecraft:command_block", bY), a("minecraft:command_block", bY));
      a(2194, a("minecraft:command_block", be), a("minecraft:command_block", be));
      a(2195, a("minecraft:command_block", bB), a("minecraft:command_block", bB));
      a(2196, a("minecraft:command_block", cf), a("minecraft:command_block", cf));
      a(2197, a("minecraft:command_block", aH), a("minecraft:command_block", aH));
      a(2200, a("minecraft:command_block", aB), a("minecraft:command_block", aB));
      a(2201, a("minecraft:command_block", bZ), a("minecraft:command_block", bZ));
      a(2202, a("minecraft:command_block", bf), a("minecraft:command_block", bf));
      a(2203, a("minecraft:command_block", bC), a("minecraft:command_block", bC));
      a(2204, a("minecraft:command_block", cg), a("minecraft:command_block", cg));
      a(2205, a("minecraft:command_block", aI), a("minecraft:command_block", aI));
      a(2208, b("minecraft:beacon"), b("minecraft:beacon"));
      a(
         2224,
         a("minecraft:cobblestone_wall", gt),
         a("minecraft:cobblestone_wall", Map.of("east", "false", "north", "false", "south", "false", "up", "false", "variant", "cobblestone", "west", "false")),
         a("minecraft:cobblestone_wall", Map.of("east", "false", "north", "false", "south", "false", "up", "false", "variant", "cobblestone", "west", "true")),
         a("minecraft:cobblestone_wall", Map.of("east", "false", "north", "false", "south", "false", "up", "true", "variant", "cobblestone", "west", "false")),
         a("minecraft:cobblestone_wall", Map.of("east", "false", "north", "false", "south", "false", "up", "true", "variant", "cobblestone", "west", "true")),
         a("minecraft:cobblestone_wall", Map.of("east", "false", "north", "false", "south", "true", "up", "false", "variant", "cobblestone", "west", "false")),
         a("minecraft:cobblestone_wall", Map.of("east", "false", "north", "false", "south", "true", "up", "false", "variant", "cobblestone", "west", "true")),
         a("minecraft:cobblestone_wall", Map.of("east", "false", "north", "false", "south", "true", "up", "true", "variant", "cobblestone", "west", "false")),
         a("minecraft:cobblestone_wall", Map.of("east", "false", "north", "false", "south", "true", "up", "true", "variant", "cobblestone", "west", "true")),
         a("minecraft:cobblestone_wall", Map.of("east", "false", "north", "true", "south", "false", "up", "false", "variant", "cobblestone", "west", "false")),
         a("minecraft:cobblestone_wall", Map.of("east", "false", "north", "true", "south", "false", "up", "false", "variant", "cobblestone", "west", "true")),
         a("minecraft:cobblestone_wall", Map.of("east", "false", "north", "true", "south", "false", "up", "true", "variant", "cobblestone", "west", "false")),
         a("minecraft:cobblestone_wall", Map.of("east", "false", "north", "true", "south", "false", "up", "true", "variant", "cobblestone", "west", "true")),
         a("minecraft:cobblestone_wall", Map.of("east", "false", "north", "true", "south", "true", "up", "false", "variant", "cobblestone", "west", "false")),
         a("minecraft:cobblestone_wall", Map.of("east", "false", "north", "true", "south", "true", "up", "false", "variant", "cobblestone", "west", "true")),
         a("minecraft:cobblestone_wall", Map.of("east", "false", "north", "true", "south", "true", "up", "true", "variant", "cobblestone", "west", "false")),
         a("minecraft:cobblestone_wall", Map.of("east", "false", "north", "true", "south", "true", "up", "true", "variant", "cobblestone", "west", "true")),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "false", "south", "false", "up", "false", "variant", "cobblestone", "west", "false")),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "false", "south", "false", "up", "false", "variant", "cobblestone", "west", "true")),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "false", "south", "false", "up", "true", "variant", "cobblestone", "west", "false")),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "false", "south", "false", "up", "true", "variant", "cobblestone", "west", "true")),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "false", "south", "true", "up", "false", "variant", "cobblestone", "west", "false")),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "false", "south", "true", "up", "false", "variant", "cobblestone", "west", "true")),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "false", "south", "true", "up", "true", "variant", "cobblestone", "west", "false")),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "false", "south", "true", "up", "true", "variant", "cobblestone", "west", "true")),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "false", "up", "false", "variant", "cobblestone", "west", "false")),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "false", "up", "false", "variant", "cobblestone", "west", "true")),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "false", "up", "true", "variant", "cobblestone", "west", "false")),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "false", "up", "true", "variant", "cobblestone", "west", "true")),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "true", "up", "false", "variant", "cobblestone", "west", "false")),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "true", "up", "false", "variant", "cobblestone", "west", "true")),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "true", "up", "true", "variant", "cobblestone", "west", "false")),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "true", "up", "true", "variant", "cobblestone", "west", "true"))
      );
      a(
         2225,
         a("minecraft:mossy_cobblestone_wall", gt),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "false", "south", "false", "up", "false", "variant", "mossy_cobblestone", "west", "false")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "false", "south", "false", "up", "false", "variant", "mossy_cobblestone", "west", "true")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "false", "south", "false", "up", "true", "variant", "mossy_cobblestone", "west", "false")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "false", "south", "false", "up", "true", "variant", "mossy_cobblestone", "west", "true")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "false", "south", "true", "up", "false", "variant", "mossy_cobblestone", "west", "false")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "false", "south", "true", "up", "false", "variant", "mossy_cobblestone", "west", "true")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "false", "south", "true", "up", "true", "variant", "mossy_cobblestone", "west", "false")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "false", "south", "true", "up", "true", "variant", "mossy_cobblestone", "west", "true")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "true", "south", "false", "up", "false", "variant", "mossy_cobblestone", "west", "false")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "true", "south", "false", "up", "false", "variant", "mossy_cobblestone", "west", "true")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "true", "south", "false", "up", "true", "variant", "mossy_cobblestone", "west", "false")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "true", "south", "false", "up", "true", "variant", "mossy_cobblestone", "west", "true")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "true", "south", "true", "up", "false", "variant", "mossy_cobblestone", "west", "false")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "true", "south", "true", "up", "false", "variant", "mossy_cobblestone", "west", "true")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "true", "south", "true", "up", "true", "variant", "mossy_cobblestone", "west", "false")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "false", "north", "true", "south", "true", "up", "true", "variant", "mossy_cobblestone", "west", "true")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "false", "south", "false", "up", "false", "variant", "mossy_cobblestone", "west", "false")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "false", "south", "false", "up", "false", "variant", "mossy_cobblestone", "west", "true")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "false", "south", "false", "up", "true", "variant", "mossy_cobblestone", "west", "false")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "false", "south", "false", "up", "true", "variant", "mossy_cobblestone", "west", "true")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "false", "south", "true", "up", "false", "variant", "mossy_cobblestone", "west", "false")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "false", "south", "true", "up", "false", "variant", "mossy_cobblestone", "west", "true")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "false", "south", "true", "up", "true", "variant", "mossy_cobblestone", "west", "false")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "false", "south", "true", "up", "true", "variant", "mossy_cobblestone", "west", "true")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "true", "south", "false", "up", "false", "variant", "mossy_cobblestone", "west", "false")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "true", "south", "false", "up", "false", "variant", "mossy_cobblestone", "west", "true")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "true", "south", "false", "up", "true", "variant", "mossy_cobblestone", "west", "false")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "true", "south", "false", "up", "true", "variant", "mossy_cobblestone", "west", "true")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "true", "south", "true", "up", "false", "variant", "mossy_cobblestone", "west", "false")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "true", "south", "true", "up", "false", "variant", "mossy_cobblestone", "west", "true")
         ),
         a(
            "minecraft:cobblestone_wall",
            Map.of("east", "true", "north", "true", "south", "true", "up", "true", "variant", "mossy_cobblestone", "west", "false")
         ),
         a("minecraft:cobblestone_wall", Map.of("east", "true", "north", "true", "south", "true", "up", "true", "variant", "mossy_cobblestone", "west", "true"))
      );
      a(
         2240,
         b("minecraft:potted_cactus"),
         a("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "0")),
         a("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "0"))
      );
      a(
         2241,
         b("minecraft:potted_cactus"),
         a("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "1")),
         a("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "1"))
      );
      a(
         2242,
         b("minecraft:potted_cactus"),
         a("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "2")),
         a("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "2"))
      );
      a(
         2243,
         b("minecraft:potted_cactus"),
         a("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "3")),
         a("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "3"))
      );
      a(
         2244,
         b("minecraft:potted_cactus"),
         a("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "4")),
         a("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "4"))
      );
      a(
         2245,
         b("minecraft:potted_cactus"),
         a("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "5")),
         a("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "5"))
      );
      a(
         2246,
         b("minecraft:potted_cactus"),
         a("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "6")),
         a("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "6"))
      );
      a(
         2247,
         b("minecraft:potted_cactus"),
         a("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "7")),
         a("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "7"))
      );
      a(
         2248,
         b("minecraft:potted_cactus"),
         a("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "8")),
         a("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "8"))
      );
      a(
         2249,
         b("minecraft:potted_cactus"),
         a("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "9")),
         a("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "9"))
      );
      a(
         2250,
         b("minecraft:potted_cactus"),
         a("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "10")),
         a("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "10"))
      );
      a(
         2251,
         b("minecraft:potted_cactus"),
         a("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "11")),
         a("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "11"))
      );
      a(
         2252,
         b("minecraft:potted_cactus"),
         a("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "12")),
         a("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "12"))
      );
      a(
         2253,
         b("minecraft:potted_cactus"),
         a("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "13")),
         a("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "13"))
      );
      a(
         2254,
         b("minecraft:potted_cactus"),
         a("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "14")),
         a("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "14"))
      );
      a(
         2255,
         b("minecraft:potted_cactus"),
         a("minecraft:flower_pot", Map.of("contents", "acacia_sapling", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "allium", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "birch_sapling", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "blue_orchid", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "cactus", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "dandelion", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "dark_oak_sapling", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "dead_bush", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "empty", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "fern", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "houstonia", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "jungle_sapling", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_brown", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "mushroom_red", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "oak_sapling", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "orange_tulip", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "oxeye_daisy", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "pink_tulip", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "red_tulip", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "rose", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "spruce_sapling", "legacy_data", "15")),
         a("minecraft:flower_pot", Map.of("contents", "white_tulip", "legacy_data", "15"))
      );
      a(2256, a("minecraft:carrots", h), a("minecraft:carrots", h));
      a(2257, a("minecraft:carrots", m), a("minecraft:carrots", m));
      a(2258, a("minecraft:carrots", x), a("minecraft:carrots", x));
      a(2259, a("minecraft:carrots", C), a("minecraft:carrots", C));
      a(2260, a("minecraft:carrots", D), a("minecraft:carrots", D));
      a(2261, a("minecraft:carrots", E), a("minecraft:carrots", E));
      a(2262, a("minecraft:carrots", F), a("minecraft:carrots", F));
      a(2263, a("minecraft:carrots", G), a("minecraft:carrots", G));
      a(2272, a("minecraft:potatoes", h), a("minecraft:potatoes", h));
      a(2273, a("minecraft:potatoes", m), a("minecraft:potatoes", m));
      a(2274, a("minecraft:potatoes", x), a("minecraft:potatoes", x));
      a(2275, a("minecraft:potatoes", C), a("minecraft:potatoes", C));
      a(2276, a("minecraft:potatoes", D), a("minecraft:potatoes", D));
      a(2277, a("minecraft:potatoes", E), a("minecraft:potatoes", E));
      a(2278, a("minecraft:potatoes", F), a("minecraft:potatoes", F));
      a(2279, a("minecraft:potatoes", G), a("minecraft:potatoes", G));
      a(2288, a("minecraft:oak_button", an), a("minecraft:wooden_button", aE));
      a(2289, a("minecraft:oak_button", ar), a("minecraft:wooden_button", bb));
      a(2290, a("minecraft:oak_button", au), a("minecraft:wooden_button", cz));
      a(2291, a("minecraft:oak_button", at), a("minecraft:wooden_button", bV));
      a(2292, a("minecraft:oak_button", as), a("minecraft:wooden_button", by));
      a(2293, a("minecraft:oak_button", ap), a("minecraft:wooden_button", cc));
      a(2296, a("minecraft:oak_button", ao), a("minecraft:wooden_button", aF));
      a(2297, a("minecraft:oak_button", av), a("minecraft:wooden_button", bc));
      a(2298, a("minecraft:oak_button", ay), a("minecraft:wooden_button", cA));
      a(2299, a("minecraft:oak_button", ax), a("minecraft:wooden_button", bW));
      a(2300, a("minecraft:oak_button", aw), a("minecraft:wooden_button", bz));
      a(2301, a("minecraft:oak_button", aq), a("minecraft:wooden_button", cd));
   }

   private static void l() {
      a(2304, a("%%FILTER_ME%%", Map.of("facing", "down", "nodrop", "false")), a("minecraft:skull", Map.of("facing", "down", "nodrop", "false")));
      a(2305, a("%%FILTER_ME%%", Map.of("facing", "up", "nodrop", "false")), a("minecraft:skull", Map.of("facing", "up", "nodrop", "false")));
      a(2306, a("%%FILTER_ME%%", Map.of("facing", "north", "nodrop", "false")), a("minecraft:skull", Map.of("facing", "north", "nodrop", "false")));
      a(2307, a("%%FILTER_ME%%", Map.of("facing", "south", "nodrop", "false")), a("minecraft:skull", Map.of("facing", "south", "nodrop", "false")));
      a(2308, a("%%FILTER_ME%%", Map.of("facing", "west", "nodrop", "false")), a("minecraft:skull", Map.of("facing", "west", "nodrop", "false")));
      a(2309, a("%%FILTER_ME%%", Map.of("facing", "east", "nodrop", "false")), a("minecraft:skull", Map.of("facing", "east", "nodrop", "false")));
      a(2312, a("%%FILTER_ME%%", Map.of("facing", "down", "nodrop", "true")), a("minecraft:skull", Map.of("facing", "down", "nodrop", "true")));
      a(2313, a("%%FILTER_ME%%", Map.of("facing", "up", "nodrop", "true")), a("minecraft:skull", Map.of("facing", "up", "nodrop", "true")));
      a(2314, a("%%FILTER_ME%%", Map.of("facing", "north", "nodrop", "true")), a("minecraft:skull", Map.of("facing", "north", "nodrop", "true")));
      a(2315, a("%%FILTER_ME%%", Map.of("facing", "south", "nodrop", "true")), a("minecraft:skull", Map.of("facing", "south", "nodrop", "true")));
      a(2316, a("%%FILTER_ME%%", Map.of("facing", "west", "nodrop", "true")), a("minecraft:skull", Map.of("facing", "west", "nodrop", "true")));
      a(2317, a("%%FILTER_ME%%", Map.of("facing", "east", "nodrop", "true")), a("minecraft:skull", Map.of("facing", "east", "nodrop", "true")));
      a(2320, a("minecraft:anvil", bA), a("minecraft:anvil", Map.of("damage", "0", "facing", "south")));
      a(2321, a("minecraft:anvil", ce), a("minecraft:anvil", Map.of("damage", "0", "facing", "west")));
      a(2322, a("minecraft:anvil", bd), a("minecraft:anvil", Map.of("damage", "0", "facing", "north")));
      a(2323, a("minecraft:anvil", aG), a("minecraft:anvil", Map.of("damage", "0", "facing", "east")));
      a(2324, a("minecraft:chipped_anvil", bA), a("minecraft:anvil", Map.of("damage", "1", "facing", "south")));
      a(2325, a("minecraft:chipped_anvil", ce), a("minecraft:anvil", Map.of("damage", "1", "facing", "west")));
      a(2326, a("minecraft:chipped_anvil", bd), a("minecraft:anvil", Map.of("damage", "1", "facing", "north")));
      a(2327, a("minecraft:chipped_anvil", aG), a("minecraft:anvil", Map.of("damage", "1", "facing", "east")));
      a(2328, a("minecraft:damaged_anvil", bA), a("minecraft:anvil", Map.of("damage", "2", "facing", "south")));
      a(2329, a("minecraft:damaged_anvil", ce), a("minecraft:anvil", Map.of("damage", "2", "facing", "west")));
      a(2330, a("minecraft:damaged_anvil", bd), a("minecraft:anvil", Map.of("damage", "2", "facing", "north")));
      a(2331, a("minecraft:damaged_anvil", aG), a("minecraft:anvil", Map.of("damage", "2", "facing", "east")));
      a(2338, a("minecraft:trapped_chest", Map.of("facing", "north", "type", "single")), a("minecraft:trapped_chest", bd));
      a(2339, a("minecraft:trapped_chest", Map.of("facing", "south", "type", "single")), a("minecraft:trapped_chest", bA));
      a(2340, a("minecraft:trapped_chest", Map.of("facing", "west", "type", "single")), a("minecraft:trapped_chest", ce));
      a(2341, a("minecraft:trapped_chest", Map.of("facing", "east", "type", "single")), a("minecraft:trapped_chest", aG));
      a(2352, a("minecraft:light_weighted_pressure_plate", fj), a("minecraft:light_weighted_pressure_plate", fj));
      a(2353, a("minecraft:light_weighted_pressure_plate", fk), a("minecraft:light_weighted_pressure_plate", fk));
      a(2354, a("minecraft:light_weighted_pressure_plate", fr), a("minecraft:light_weighted_pressure_plate", fr));
      a(2355, a("minecraft:light_weighted_pressure_plate", fs), a("minecraft:light_weighted_pressure_plate", fs));
      a(2356, a("minecraft:light_weighted_pressure_plate", ft), a("minecraft:light_weighted_pressure_plate", ft));
      a(2357, a("minecraft:light_weighted_pressure_plate", fu), a("minecraft:light_weighted_pressure_plate", fu));
      a(2358, a("minecraft:light_weighted_pressure_plate", fv), a("minecraft:light_weighted_pressure_plate", fv));
      a(2359, a("minecraft:light_weighted_pressure_plate", fw), a("minecraft:light_weighted_pressure_plate", fw));
      a(2360, a("minecraft:light_weighted_pressure_plate", fx), a("minecraft:light_weighted_pressure_plate", fx));
      a(2361, a("minecraft:light_weighted_pressure_plate", fy), a("minecraft:light_weighted_pressure_plate", fy));
      a(2362, a("minecraft:light_weighted_pressure_plate", fl), a("minecraft:light_weighted_pressure_plate", fl));
      a(2363, a("minecraft:light_weighted_pressure_plate", fm), a("minecraft:light_weighted_pressure_plate", fm));
      a(2364, a("minecraft:light_weighted_pressure_plate", fn), a("minecraft:light_weighted_pressure_plate", fn));
      a(2365, a("minecraft:light_weighted_pressure_plate", fo), a("minecraft:light_weighted_pressure_plate", fo));
      a(2366, a("minecraft:light_weighted_pressure_plate", fp), a("minecraft:light_weighted_pressure_plate", fp));
      a(2367, a("minecraft:light_weighted_pressure_plate", fq), a("minecraft:light_weighted_pressure_plate", fq));
      a(2368, a("minecraft:heavy_weighted_pressure_plate", fj), a("minecraft:heavy_weighted_pressure_plate", fj));
      a(2369, a("minecraft:heavy_weighted_pressure_plate", fk), a("minecraft:heavy_weighted_pressure_plate", fk));
      a(2370, a("minecraft:heavy_weighted_pressure_plate", fr), a("minecraft:heavy_weighted_pressure_plate", fr));
      a(2371, a("minecraft:heavy_weighted_pressure_plate", fs), a("minecraft:heavy_weighted_pressure_plate", fs));
      a(2372, a("minecraft:heavy_weighted_pressure_plate", ft), a("minecraft:heavy_weighted_pressure_plate", ft));
      a(2373, a("minecraft:heavy_weighted_pressure_plate", fu), a("minecraft:heavy_weighted_pressure_plate", fu));
      a(2374, a("minecraft:heavy_weighted_pressure_plate", fv), a("minecraft:heavy_weighted_pressure_plate", fv));
      a(2375, a("minecraft:heavy_weighted_pressure_plate", fw), a("minecraft:heavy_weighted_pressure_plate", fw));
      a(2376, a("minecraft:heavy_weighted_pressure_plate", fx), a("minecraft:heavy_weighted_pressure_plate", fx));
      a(2377, a("minecraft:heavy_weighted_pressure_plate", fy), a("minecraft:heavy_weighted_pressure_plate", fy));
      a(2378, a("minecraft:heavy_weighted_pressure_plate", fl), a("minecraft:heavy_weighted_pressure_plate", fl));
      a(2379, a("minecraft:heavy_weighted_pressure_plate", fm), a("minecraft:heavy_weighted_pressure_plate", fm));
      a(2380, a("minecraft:heavy_weighted_pressure_plate", fn), a("minecraft:heavy_weighted_pressure_plate", fn));
      a(2381, a("minecraft:heavy_weighted_pressure_plate", fo), a("minecraft:heavy_weighted_pressure_plate", fo));
      a(2382, a("minecraft:heavy_weighted_pressure_plate", fp), a("minecraft:heavy_weighted_pressure_plate", fp));
      a(2383, a("minecraft:heavy_weighted_pressure_plate", fq), a("minecraft:heavy_weighted_pressure_plate", fq));
      a(2384, a("minecraft:comparator", eE), a("minecraft:unpowered_comparator", eE));
      a(2385, a("minecraft:comparator", eF), a("minecraft:unpowered_comparator", eF));
      a(2386, a("minecraft:comparator", eD), a("minecraft:unpowered_comparator", eD));
      a(2387, a("minecraft:comparator", eC), a("minecraft:unpowered_comparator", eC));
      a(2388, a("minecraft:comparator", eI), a("minecraft:unpowered_comparator", eI));
      a(2389, a("minecraft:comparator", eJ), a("minecraft:unpowered_comparator", eJ));
      a(2390, a("minecraft:comparator", eH), a("minecraft:unpowered_comparator", eH));
      a(2391, a("minecraft:comparator", eG), a("minecraft:unpowered_comparator", eG));
      a(2392, a("minecraft:comparator", fd), a("minecraft:unpowered_comparator", fd));
      a(2393, a("minecraft:comparator", fe), a("minecraft:unpowered_comparator", fe));
      a(2394, a("minecraft:comparator", fc), a("minecraft:unpowered_comparator", fc));
      a(2395, a("minecraft:comparator", fb), a("minecraft:unpowered_comparator", fb));
      a(2396, a("minecraft:comparator", fh), a("minecraft:unpowered_comparator", fh));
      a(2397, a("minecraft:comparator", fi), a("minecraft:unpowered_comparator", fi));
      a(2398, a("minecraft:comparator", fg), a("minecraft:unpowered_comparator", fg));
      a(2399, a("minecraft:comparator", ff), a("minecraft:unpowered_comparator", ff));
      a(2400, a("minecraft:comparator", eE), a("minecraft:powered_comparator", eE));
      a(2401, a("minecraft:comparator", eF), a("minecraft:powered_comparator", eF));
      a(2402, a("minecraft:comparator", eD), a("minecraft:powered_comparator", eD));
      a(2403, a("minecraft:comparator", eC), a("minecraft:powered_comparator", eC));
      a(2404, a("minecraft:comparator", eI), a("minecraft:powered_comparator", eI));
      a(2405, a("minecraft:comparator", eJ), a("minecraft:powered_comparator", eJ));
      a(2406, a("minecraft:comparator", eH), a("minecraft:powered_comparator", eH));
      a(2407, a("minecraft:comparator", eG), a("minecraft:powered_comparator", eG));
      a(2408, a("minecraft:comparator", fd), a("minecraft:powered_comparator", fd));
      a(2409, a("minecraft:comparator", fe), a("minecraft:powered_comparator", fe));
      a(2410, a("minecraft:comparator", fc), a("minecraft:powered_comparator", fc));
      a(2411, a("minecraft:comparator", fb), a("minecraft:powered_comparator", fb));
      a(2412, a("minecraft:comparator", fh), a("minecraft:powered_comparator", fh));
      a(2413, a("minecraft:comparator", fi), a("minecraft:powered_comparator", fi));
      a(2414, a("minecraft:comparator", fg), a("minecraft:powered_comparator", fg));
      a(2415, a("minecraft:comparator", ff), a("minecraft:powered_comparator", ff));
      a(2416, a("minecraft:daylight_detector", Map.of("inverted", "false", "power", "0")), a("minecraft:daylight_detector", fj));
      a(2417, a("minecraft:daylight_detector", Map.of("inverted", "false", "power", "1")), a("minecraft:daylight_detector", fk));
      a(2418, a("minecraft:daylight_detector", Map.of("inverted", "false", "power", "2")), a("minecraft:daylight_detector", fr));
      a(2419, a("minecraft:daylight_detector", Map.of("inverted", "false", "power", "3")), a("minecraft:daylight_detector", fs));
      a(2420, a("minecraft:daylight_detector", Map.of("inverted", "false", "power", "4")), a("minecraft:daylight_detector", ft));
      a(2421, a("minecraft:daylight_detector", Map.of("inverted", "false", "power", "5")), a("minecraft:daylight_detector", fu));
      a(2422, a("minecraft:daylight_detector", Map.of("inverted", "false", "power", "6")), a("minecraft:daylight_detector", fv));
      a(2423, a("minecraft:daylight_detector", Map.of("inverted", "false", "power", "7")), a("minecraft:daylight_detector", fw));
      a(2424, a("minecraft:daylight_detector", Map.of("inverted", "false", "power", "8")), a("minecraft:daylight_detector", fx));
      a(2425, a("minecraft:daylight_detector", Map.of("inverted", "false", "power", "9")), a("minecraft:daylight_detector", fy));
      a(2426, a("minecraft:daylight_detector", Map.of("inverted", "false", "power", "10")), a("minecraft:daylight_detector", fl));
      a(2427, a("minecraft:daylight_detector", Map.of("inverted", "false", "power", "11")), a("minecraft:daylight_detector", fm));
      a(2428, a("minecraft:daylight_detector", Map.of("inverted", "false", "power", "12")), a("minecraft:daylight_detector", fn));
      a(2429, a("minecraft:daylight_detector", Map.of("inverted", "false", "power", "13")), a("minecraft:daylight_detector", fo));
      a(2430, a("minecraft:daylight_detector", Map.of("inverted", "false", "power", "14")), a("minecraft:daylight_detector", fp));
      a(2431, a("minecraft:daylight_detector", Map.of("inverted", "false", "power", "15")), a("minecraft:daylight_detector", fq));
      a(2432, b("minecraft:redstone_block"), b("minecraft:redstone_block"));
      a(2448, b("minecraft:nether_quartz_ore"), b("minecraft:quartz_ore"));
      a(2464, a("minecraft:hopper", Map.of("enabled", "true", "facing", "down")), a("minecraft:hopper", Map.of("enabled", "true", "facing", "down")));
      a(2466, a("minecraft:hopper", Map.of("enabled", "true", "facing", "north")), a("minecraft:hopper", Map.of("enabled", "true", "facing", "north")));
      a(2467, a("minecraft:hopper", Map.of("enabled", "true", "facing", "south")), a("minecraft:hopper", Map.of("enabled", "true", "facing", "south")));
      a(2468, a("minecraft:hopper", Map.of("enabled", "true", "facing", "west")), a("minecraft:hopper", Map.of("enabled", "true", "facing", "west")));
      a(2469, a("minecraft:hopper", Map.of("enabled", "true", "facing", "east")), a("minecraft:hopper", Map.of("enabled", "true", "facing", "east")));
      a(2472, a("minecraft:hopper", Map.of("enabled", "false", "facing", "down")), a("minecraft:hopper", Map.of("enabled", "false", "facing", "down")));
      a(2474, a("minecraft:hopper", Map.of("enabled", "false", "facing", "north")), a("minecraft:hopper", Map.of("enabled", "false", "facing", "north")));
      a(2475, a("minecraft:hopper", Map.of("enabled", "false", "facing", "south")), a("minecraft:hopper", Map.of("enabled", "false", "facing", "south")));
      a(2476, a("minecraft:hopper", Map.of("enabled", "false", "facing", "west")), a("minecraft:hopper", Map.of("enabled", "false", "facing", "west")));
      a(2477, a("minecraft:hopper", Map.of("enabled", "false", "facing", "east")), a("minecraft:hopper", Map.of("enabled", "false", "facing", "east")));
      a(2480, b("minecraft:quartz_block"), a("minecraft:quartz_block", Map.of("variant", "default")));
      a(2481, b("minecraft:chiseled_quartz_block"), a("minecraft:quartz_block", Map.of("variant", "chiseled")));
      a(2482, a("minecraft:quartz_pillar", K), a("minecraft:quartz_block", Map.of("variant", "lines_y")));
      a(2483, a("minecraft:quartz_pillar", J), a("minecraft:quartz_block", Map.of("variant", "lines_x")));
      a(2484, a("minecraft:quartz_pillar", L), a("minecraft:quartz_block", Map.of("variant", "lines_z")));
      a(
         2496,
         a("minecraft:quartz_stairs", cZ),
         a("minecraft:quartz_stairs", cJ),
         a("minecraft:quartz_stairs", cN),
         a("minecraft:quartz_stairs", cR),
         a("minecraft:quartz_stairs", cV),
         a("minecraft:quartz_stairs", cZ)
      );
      a(
         2497,
         a("minecraft:quartz_stairs", dc),
         a("minecraft:quartz_stairs", cM),
         a("minecraft:quartz_stairs", cQ),
         a("minecraft:quartz_stairs", cU),
         a("minecraft:quartz_stairs", cY),
         a("minecraft:quartz_stairs", dc)
      );
      a(
         2498,
         a("minecraft:quartz_stairs", db),
         a("minecraft:quartz_stairs", cL),
         a("minecraft:quartz_stairs", cP),
         a("minecraft:quartz_stairs", cT),
         a("minecraft:quartz_stairs", cX),
         a("minecraft:quartz_stairs", db)
      );
      a(
         2499,
         a("minecraft:quartz_stairs", da),
         a("minecraft:quartz_stairs", cK),
         a("minecraft:quartz_stairs", cO),
         a("minecraft:quartz_stairs", cS),
         a("minecraft:quartz_stairs", cW),
         a("minecraft:quartz_stairs", da)
      );
      a(
         2500,
         a("minecraft:quartz_stairs", dC),
         a("minecraft:quartz_stairs", dm),
         a("minecraft:quartz_stairs", dq),
         a("minecraft:quartz_stairs", du),
         a("minecraft:quartz_stairs", dy),
         a("minecraft:quartz_stairs", dC)
      );
      a(
         2501,
         a("minecraft:quartz_stairs", dF),
         a("minecraft:quartz_stairs", dp),
         a("minecraft:quartz_stairs", dt),
         a("minecraft:quartz_stairs", dx),
         a("minecraft:quartz_stairs", dB),
         a("minecraft:quartz_stairs", dF)
      );
      a(
         2502,
         a("minecraft:quartz_stairs", dE),
         a("minecraft:quartz_stairs", do),
         a("minecraft:quartz_stairs", ds),
         a("minecraft:quartz_stairs", dw),
         a("minecraft:quartz_stairs", dA),
         a("minecraft:quartz_stairs", dE)
      );
      a(
         2503,
         a("minecraft:quartz_stairs", dD),
         a("minecraft:quartz_stairs", dn),
         a("minecraft:quartz_stairs", dr),
         a("minecraft:quartz_stairs", dv),
         a("minecraft:quartz_stairs", dz),
         a("minecraft:quartz_stairs", dD)
      );
      a(2512, a("minecraft:activator_rail", fZ), a("minecraft:activator_rail", fZ));
      a(2513, a("minecraft:activator_rail", fX), a("minecraft:activator_rail", fX));
      a(2514, a("minecraft:activator_rail", fP), a("minecraft:activator_rail", fP));
      a(2515, a("minecraft:activator_rail", fV), a("minecraft:activator_rail", fV));
      a(2516, a("minecraft:activator_rail", fR), a("minecraft:activator_rail", fR));
      a(2517, a("minecraft:activator_rail", fT), a("minecraft:activator_rail", fT));
      a(2520, a("minecraft:activator_rail", ga), a("minecraft:activator_rail", ga));
      a(2521, a("minecraft:activator_rail", fY), a("minecraft:activator_rail", fY));
      a(2522, a("minecraft:activator_rail", fQ), a("minecraft:activator_rail", fQ));
      a(2523, a("minecraft:activator_rail", fW), a("minecraft:activator_rail", fW));
      a(2524, a("minecraft:activator_rail", fS), a("minecraft:activator_rail", fS));
      a(2525, a("minecraft:activator_rail", fU), a("minecraft:activator_rail", fU));
      a(2528, a("minecraft:dropper", ge), a("minecraft:dropper", ge));
      a(2529, a("minecraft:dropper", gi), a("minecraft:dropper", gi));
      a(2530, a("minecraft:dropper", gg), a("minecraft:dropper", gg));
      a(2531, a("minecraft:dropper", gh), a("minecraft:dropper", gh));
      a(2532, a("minecraft:dropper", gj), a("minecraft:dropper", gj));
      a(2533, a("minecraft:dropper", gf), a("minecraft:dropper", gf));
      a(2536, a("minecraft:dropper", gk), a("minecraft:dropper", gk));
      a(2537, a("minecraft:dropper", go), a("minecraft:dropper", go));
      a(2538, a("minecraft:dropper", gm), a("minecraft:dropper", gm));
      a(2539, a("minecraft:dropper", gn), a("minecraft:dropper", gn));
      a(2540, a("minecraft:dropper", gp), a("minecraft:dropper", gp));
      a(2541, a("minecraft:dropper", gl), a("minecraft:dropper", gl));
      a(2544, b("minecraft:white_terracotta"), a("minecraft:stained_hardened_clay", ae));
      a(2545, b("minecraft:orange_terracotta"), a("minecraft:stained_hardened_clay", Z));
      a(2546, b("minecraft:magenta_terracotta"), a("minecraft:stained_hardened_clay", Y));
      a(2547, b("minecraft:light_blue_terracotta"), a("minecraft:stained_hardened_clay", W));
      a(2548, b("minecraft:yellow_terracotta"), a("minecraft:stained_hardened_clay", af));
      a(2549, b("minecraft:lime_terracotta"), a("minecraft:stained_hardened_clay", X));
      a(2550, b("minecraft:pink_terracotta"), a("minecraft:stained_hardened_clay", aa));
      a(2551, b("minecraft:gray_terracotta"), a("minecraft:stained_hardened_clay", U));
      a(2552, b("minecraft:light_gray_terracotta"), a("minecraft:stained_hardened_clay", ad));
      a(2553, b("minecraft:cyan_terracotta"), a("minecraft:stained_hardened_clay", T));
      a(2554, b("minecraft:purple_terracotta"), a("minecraft:stained_hardened_clay", ab));
      a(2555, b("minecraft:blue_terracotta"), a("minecraft:stained_hardened_clay", R));
      a(2556, b("minecraft:brown_terracotta"), a("minecraft:stained_hardened_clay", S));
      a(2557, b("minecraft:green_terracotta"), a("minecraft:stained_hardened_clay", V));
      a(2558, b("minecraft:red_terracotta"), a("minecraft:stained_hardened_clay", ac));
      a(2559, b("minecraft:black_terracotta"), a("minecraft:stained_hardened_clay", Q));
   }

   private static void m() {
      a(
         2560,
         a("minecraft:white_stained_glass_pane", gu),
         a("minecraft:stained_glass_pane", Map.of("color", "white", "east", "false", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "white", "east", "false", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "white", "east", "false", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "white", "east", "false", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "white", "east", "false", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "white", "east", "false", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "white", "east", "false", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "white", "east", "false", "north", "true", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "white", "east", "true", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "white", "east", "true", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "white", "east", "true", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "white", "east", "true", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "white", "east", "true", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "white", "east", "true", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "white", "east", "true", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "white", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      a(
         2561,
         a("minecraft:orange_stained_glass_pane", gu),
         a("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "false", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "false", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "false", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "false", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "false", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "false", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "false", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "false", "north", "true", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "true", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "true", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "true", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "true", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "true", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "true", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "true", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "orange", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      a(
         2562,
         a("minecraft:magenta_stained_glass_pane", gu),
         a("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "false", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "false", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "false", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "false", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "false", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "false", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "false", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "false", "north", "true", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "true", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "true", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "true", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "true", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "true", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "true", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "true", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "magenta", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      a(
         2563,
         a("minecraft:light_blue_stained_glass_pane", gu),
         a("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "false", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "false", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "false", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "false", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "false", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "false", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "false", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "false", "north", "true", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "true", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "true", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "true", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "true", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "true", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "true", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "true", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "light_blue", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      a(
         2564,
         a("minecraft:yellow_stained_glass_pane", gu),
         a("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "false", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "false", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "false", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "false", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "false", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "false", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "false", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "false", "north", "true", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "true", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "true", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "true", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "true", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "true", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "true", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "true", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "yellow", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      a(
         2565,
         a("minecraft:lime_stained_glass_pane", gu),
         a("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "false", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "false", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "false", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "false", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "false", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "false", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "false", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "false", "north", "true", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "true", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "true", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "true", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "true", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "true", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "true", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "true", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "lime", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      a(
         2566,
         a("minecraft:pink_stained_glass_pane", gu),
         a("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "false", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "false", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "false", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "false", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "false", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "false", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "false", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "false", "north", "true", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "true", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "true", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "true", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "true", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "true", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "true", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "true", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "pink", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      a(
         2567,
         a("minecraft:gray_stained_glass_pane", gu),
         a("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "false", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "false", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "false", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "false", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "false", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "false", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "false", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "false", "north", "true", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "true", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "true", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "true", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "true", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "true", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "true", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "true", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "gray", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      a(
         2568,
         a("minecraft:light_gray_stained_glass_pane", gu),
         a("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "false", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "false", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "false", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "false", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "false", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "false", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "false", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "false", "north", "true", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "true", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "true", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "true", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "true", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "true", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "true", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "true", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "silver", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      a(
         2569,
         a("minecraft:cyan_stained_glass_pane", gu),
         a("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "false", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "false", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "false", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "false", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "false", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "false", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "false", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "false", "north", "true", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "true", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "true", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "true", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "true", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "true", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "true", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "true", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "cyan", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      a(
         2570,
         a("minecraft:purple_stained_glass_pane", gu),
         a("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "false", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "false", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "false", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "false", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "false", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "false", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "false", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "false", "north", "true", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "true", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "true", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "true", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "true", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "true", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "true", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "true", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "purple", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      a(
         2571,
         a("minecraft:blue_stained_glass_pane", gu),
         a("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "false", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "false", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "false", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "false", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "false", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "false", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "false", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "false", "north", "true", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "true", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "true", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "true", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "true", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "true", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "true", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "true", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "blue", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      a(
         2572,
         a("minecraft:brown_stained_glass_pane", gu),
         a("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "false", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "false", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "false", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "false", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "false", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "false", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "false", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "false", "north", "true", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "true", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "true", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "true", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "true", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "true", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "true", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "true", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "brown", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      a(
         2573,
         a("minecraft:green_stained_glass_pane", gu),
         a("minecraft:stained_glass_pane", Map.of("color", "green", "east", "false", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "green", "east", "false", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "green", "east", "false", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "green", "east", "false", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "green", "east", "false", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "green", "east", "false", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "green", "east", "false", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "green", "east", "false", "north", "true", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "green", "east", "true", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "green", "east", "true", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "green", "east", "true", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "green", "east", "true", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "green", "east", "true", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "green", "east", "true", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "green", "east", "true", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "green", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      a(
         2574,
         a("minecraft:red_stained_glass_pane", gu),
         a("minecraft:stained_glass_pane", Map.of("color", "red", "east", "false", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "red", "east", "false", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "red", "east", "false", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "red", "east", "false", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "red", "east", "false", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "red", "east", "false", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "red", "east", "false", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "red", "east", "false", "north", "true", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "red", "east", "true", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "red", "east", "true", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "red", "east", "true", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "red", "east", "true", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "red", "east", "true", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "red", "east", "true", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "red", "east", "true", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "red", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      a(
         2575,
         a("minecraft:black_stained_glass_pane", gu),
         a("minecraft:stained_glass_pane", Map.of("color", "black", "east", "false", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "black", "east", "false", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "black", "east", "false", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "black", "east", "false", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "black", "east", "false", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "black", "east", "false", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "black", "east", "false", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "black", "east", "false", "north", "true", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "black", "east", "true", "north", "false", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "black", "east", "true", "north", "false", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "black", "east", "true", "north", "false", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "black", "east", "true", "north", "false", "south", "true", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "black", "east", "true", "north", "true", "south", "false", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "black", "east", "true", "north", "true", "south", "false", "west", "true")),
         a("minecraft:stained_glass_pane", Map.of("color", "black", "east", "true", "north", "true", "south", "true", "west", "false")),
         a("minecraft:stained_glass_pane", Map.of("color", "black", "east", "true", "north", "true", "south", "true", "west", "true"))
      );
      a(2576, a("minecraft:acacia_leaves", N), a("minecraft:leaves2", Map.of("check_decay", "false", "decayable", "true", "variant", "acacia")));
      a(2577, a("minecraft:dark_oak_leaves", N), a("minecraft:leaves2", Map.of("check_decay", "false", "decayable", "true", "variant", "dark_oak")));
      a(2580, a("minecraft:acacia_leaves", M), a("minecraft:leaves2", Map.of("check_decay", "false", "decayable", "false", "variant", "acacia")));
      a(2581, a("minecraft:dark_oak_leaves", M), a("minecraft:leaves2", Map.of("check_decay", "false", "decayable", "false", "variant", "dark_oak")));
      a(2584, a("minecraft:acacia_leaves", P), a("minecraft:leaves2", Map.of("check_decay", "true", "decayable", "true", "variant", "acacia")));
      a(2585, a("minecraft:dark_oak_leaves", P), a("minecraft:leaves2", Map.of("check_decay", "true", "decayable", "true", "variant", "dark_oak")));
      a(2588, a("minecraft:acacia_leaves", O), a("minecraft:leaves2", Map.of("check_decay", "true", "decayable", "false", "variant", "acacia")));
      a(2589, a("minecraft:dark_oak_leaves", O), a("minecraft:leaves2", Map.of("check_decay", "true", "decayable", "false", "variant", "dark_oak")));
      a(2592, a("minecraft:acacia_log", K), a("minecraft:log2", Map.of("axis", "y", "variant", "acacia")));
      a(2593, a("minecraft:dark_oak_log", K), a("minecraft:log2", Map.of("axis", "y", "variant", "dark_oak")));
      a(2596, a("minecraft:acacia_log", J), a("minecraft:log2", Map.of("axis", "x", "variant", "acacia")));
      a(2597, a("minecraft:dark_oak_log", J), a("minecraft:log2", Map.of("axis", "x", "variant", "dark_oak")));
      a(2600, a("minecraft:acacia_log", L), a("minecraft:log2", Map.of("axis", "z", "variant", "acacia")));
      a(2601, a("minecraft:dark_oak_log", L), a("minecraft:log2", Map.of("axis", "z", "variant", "dark_oak")));
      a(2604, b("minecraft:acacia_bark"), a("minecraft:log2", Map.of("axis", "none", "variant", "acacia")));
      a(2605, b("minecraft:dark_oak_bark"), a("minecraft:log2", Map.of("axis", "none", "variant", "dark_oak")));
      a(
         2608,
         a("minecraft:acacia_stairs", cZ),
         a("minecraft:acacia_stairs", cJ),
         a("minecraft:acacia_stairs", cN),
         a("minecraft:acacia_stairs", cR),
         a("minecraft:acacia_stairs", cV),
         a("minecraft:acacia_stairs", cZ)
      );
      a(
         2609,
         a("minecraft:acacia_stairs", dc),
         a("minecraft:acacia_stairs", cM),
         a("minecraft:acacia_stairs", cQ),
         a("minecraft:acacia_stairs", cU),
         a("minecraft:acacia_stairs", cY),
         a("minecraft:acacia_stairs", dc)
      );
      a(
         2610,
         a("minecraft:acacia_stairs", db),
         a("minecraft:acacia_stairs", cL),
         a("minecraft:acacia_stairs", cP),
         a("minecraft:acacia_stairs", cT),
         a("minecraft:acacia_stairs", cX),
         a("minecraft:acacia_stairs", db)
      );
      a(
         2611,
         a("minecraft:acacia_stairs", da),
         a("minecraft:acacia_stairs", cK),
         a("minecraft:acacia_stairs", cO),
         a("minecraft:acacia_stairs", cS),
         a("minecraft:acacia_stairs", cW),
         a("minecraft:acacia_stairs", da)
      );
      a(
         2612,
         a("minecraft:acacia_stairs", dC),
         a("minecraft:acacia_stairs", dm),
         a("minecraft:acacia_stairs", dq),
         a("minecraft:acacia_stairs", du),
         a("minecraft:acacia_stairs", dy),
         a("minecraft:acacia_stairs", dC)
      );
      a(
         2613,
         a("minecraft:acacia_stairs", dF),
         a("minecraft:acacia_stairs", dp),
         a("minecraft:acacia_stairs", dt),
         a("minecraft:acacia_stairs", dx),
         a("minecraft:acacia_stairs", dB),
         a("minecraft:acacia_stairs", dF)
      );
      a(
         2614,
         a("minecraft:acacia_stairs", dE),
         a("minecraft:acacia_stairs", do),
         a("minecraft:acacia_stairs", ds),
         a("minecraft:acacia_stairs", dw),
         a("minecraft:acacia_stairs", dA),
         a("minecraft:acacia_stairs", dE)
      );
      a(
         2615,
         a("minecraft:acacia_stairs", dD),
         a("minecraft:acacia_stairs", dn),
         a("minecraft:acacia_stairs", dr),
         a("minecraft:acacia_stairs", dv),
         a("minecraft:acacia_stairs", dz),
         a("minecraft:acacia_stairs", dD)
      );
      a(
         2624,
         a("minecraft:dark_oak_stairs", cZ),
         a("minecraft:dark_oak_stairs", cJ),
         a("minecraft:dark_oak_stairs", cN),
         a("minecraft:dark_oak_stairs", cR),
         a("minecraft:dark_oak_stairs", cV),
         a("minecraft:dark_oak_stairs", cZ)
      );
      a(
         2625,
         a("minecraft:dark_oak_stairs", dc),
         a("minecraft:dark_oak_stairs", cM),
         a("minecraft:dark_oak_stairs", cQ),
         a("minecraft:dark_oak_stairs", cU),
         a("minecraft:dark_oak_stairs", cY),
         a("minecraft:dark_oak_stairs", dc)
      );
      a(
         2626,
         a("minecraft:dark_oak_stairs", db),
         a("minecraft:dark_oak_stairs", cL),
         a("minecraft:dark_oak_stairs", cP),
         a("minecraft:dark_oak_stairs", cT),
         a("minecraft:dark_oak_stairs", cX),
         a("minecraft:dark_oak_stairs", db)
      );
      a(
         2627,
         a("minecraft:dark_oak_stairs", da),
         a("minecraft:dark_oak_stairs", cK),
         a("minecraft:dark_oak_stairs", cO),
         a("minecraft:dark_oak_stairs", cS),
         a("minecraft:dark_oak_stairs", cW),
         a("minecraft:dark_oak_stairs", da)
      );
      a(
         2628,
         a("minecraft:dark_oak_stairs", dC),
         a("minecraft:dark_oak_stairs", dm),
         a("minecraft:dark_oak_stairs", dq),
         a("minecraft:dark_oak_stairs", du),
         a("minecraft:dark_oak_stairs", dy),
         a("minecraft:dark_oak_stairs", dC)
      );
      a(
         2629,
         a("minecraft:dark_oak_stairs", dF),
         a("minecraft:dark_oak_stairs", dp),
         a("minecraft:dark_oak_stairs", dt),
         a("minecraft:dark_oak_stairs", dx),
         a("minecraft:dark_oak_stairs", dB),
         a("minecraft:dark_oak_stairs", dF)
      );
      a(
         2630,
         a("minecraft:dark_oak_stairs", dE),
         a("minecraft:dark_oak_stairs", do),
         a("minecraft:dark_oak_stairs", ds),
         a("minecraft:dark_oak_stairs", dw),
         a("minecraft:dark_oak_stairs", dA),
         a("minecraft:dark_oak_stairs", dE)
      );
      a(
         2631,
         a("minecraft:dark_oak_stairs", dD),
         a("minecraft:dark_oak_stairs", dn),
         a("minecraft:dark_oak_stairs", dr),
         a("minecraft:dark_oak_stairs", dv),
         a("minecraft:dark_oak_stairs", dz),
         a("minecraft:dark_oak_stairs", dD)
      );
      a(2640, b("minecraft:slime_block"), b("minecraft:slime"));
      a(2656, b("minecraft:barrier"), b("minecraft:barrier"));
      a(2672, a("minecraft:iron_trapdoor", cC), a("minecraft:iron_trapdoor", cC));
      a(2673, a("minecraft:iron_trapdoor", cD), a("minecraft:iron_trapdoor", cD));
      a(2674, a("minecraft:iron_trapdoor", cE), a("minecraft:iron_trapdoor", cE));
      a(2675, a("minecraft:iron_trapdoor", cB), a("minecraft:iron_trapdoor", cB));
      a(2676, a("minecraft:iron_trapdoor", cG), a("minecraft:iron_trapdoor", cG));
      a(2677, a("minecraft:iron_trapdoor", cH), a("minecraft:iron_trapdoor", cH));
      a(2678, a("minecraft:iron_trapdoor", cI), a("minecraft:iron_trapdoor", cI));
      a(2679, a("minecraft:iron_trapdoor", cF), a("minecraft:iron_trapdoor", cF));
      a(2680, a("minecraft:iron_trapdoor", df), a("minecraft:iron_trapdoor", df));
      a(2681, a("minecraft:iron_trapdoor", dg), a("minecraft:iron_trapdoor", dg));
      a(2682, a("minecraft:iron_trapdoor", dh), a("minecraft:iron_trapdoor", dh));
      a(2683, a("minecraft:iron_trapdoor", de), a("minecraft:iron_trapdoor", de));
      a(2684, a("minecraft:iron_trapdoor", dj), a("minecraft:iron_trapdoor", dj));
      a(2685, a("minecraft:iron_trapdoor", dk), a("minecraft:iron_trapdoor", dk));
      a(2686, a("minecraft:iron_trapdoor", dl), a("minecraft:iron_trapdoor", dl));
      a(2687, a("minecraft:iron_trapdoor", di), a("minecraft:iron_trapdoor", di));
      a(2688, b("minecraft:prismarine"), a("minecraft:prismarine", Map.of("variant", "prismarine")));
      a(2689, b("minecraft:prismarine_bricks"), a("minecraft:prismarine", Map.of("variant", "prismarine_bricks")));
      a(2690, b("minecraft:dark_prismarine"), a("minecraft:prismarine", Map.of("variant", "dark_prismarine")));
      a(2704, b("minecraft:sea_lantern"), b("minecraft:sea_lantern"));
      a(2720, a("minecraft:hay_block", K), a("minecraft:hay_block", K));
      a(2724, a("minecraft:hay_block", J), a("minecraft:hay_block", J));
      a(2728, a("minecraft:hay_block", L), a("minecraft:hay_block", L));
      a(2736, b("minecraft:white_carpet"), a("minecraft:carpet", ae));
      a(2737, b("minecraft:orange_carpet"), a("minecraft:carpet", Z));
      a(2738, b("minecraft:magenta_carpet"), a("minecraft:carpet", Y));
      a(2739, b("minecraft:light_blue_carpet"), a("minecraft:carpet", W));
      a(2740, b("minecraft:yellow_carpet"), a("minecraft:carpet", af));
      a(2741, b("minecraft:lime_carpet"), a("minecraft:carpet", X));
      a(2742, b("minecraft:pink_carpet"), a("minecraft:carpet", aa));
      a(2743, b("minecraft:gray_carpet"), a("minecraft:carpet", U));
      a(2744, b("minecraft:light_gray_carpet"), a("minecraft:carpet", ad));
      a(2745, b("minecraft:cyan_carpet"), a("minecraft:carpet", T));
      a(2746, b("minecraft:purple_carpet"), a("minecraft:carpet", ab));
      a(2747, b("minecraft:blue_carpet"), a("minecraft:carpet", R));
      a(2748, b("minecraft:brown_carpet"), a("minecraft:carpet", S));
      a(2749, b("minecraft:green_carpet"), a("minecraft:carpet", V));
      a(2750, b("minecraft:red_carpet"), a("minecraft:carpet", ac));
      a(2751, b("minecraft:black_carpet"), a("minecraft:carpet", Q));
      a(2752, b("minecraft:terracotta"), b("minecraft:hardened_clay"));
      a(2768, b("minecraft:coal_block"), b("minecraft:coal_block"));
      a(2784, b("minecraft:packed_ice"), b("minecraft:packed_ice"));
      a(
         2800,
         a("minecraft:sunflower", dd),
         a("minecraft:double_plant", Map.of("facing", "east", "half", "lower", "variant", "sunflower")),
         a("minecraft:double_plant", Map.of("facing", "north", "half", "lower", "variant", "sunflower")),
         a("minecraft:double_plant", Map.of("facing", "south", "half", "lower", "variant", "sunflower")),
         a("minecraft:double_plant", Map.of("facing", "west", "half", "lower", "variant", "sunflower"))
      );
      a(
         2801,
         a("minecraft:lilac", dd),
         a("minecraft:double_plant", Map.of("facing", "east", "half", "lower", "variant", "syringa")),
         a("minecraft:double_plant", Map.of("facing", "north", "half", "lower", "variant", "syringa")),
         a("minecraft:double_plant", Map.of("facing", "south", "half", "lower", "variant", "syringa")),
         a("minecraft:double_plant", Map.of("facing", "west", "half", "lower", "variant", "syringa"))
      );
      a(
         2802,
         a("minecraft:tall_grass", dd),
         a("minecraft:double_plant", Map.of("facing", "east", "half", "lower", "variant", "double_grass")),
         a("minecraft:double_plant", Map.of("facing", "north", "half", "lower", "variant", "double_grass")),
         a("minecraft:double_plant", Map.of("facing", "south", "half", "lower", "variant", "double_grass")),
         a("minecraft:double_plant", Map.of("facing", "west", "half", "lower", "variant", "double_grass"))
      );
      a(
         2803,
         a("minecraft:large_fern", dd),
         a("minecraft:double_plant", Map.of("facing", "east", "half", "lower", "variant", "double_fern")),
         a("minecraft:double_plant", Map.of("facing", "north", "half", "lower", "variant", "double_fern")),
         a("minecraft:double_plant", Map.of("facing", "south", "half", "lower", "variant", "double_fern")),
         a("minecraft:double_plant", Map.of("facing", "west", "half", "lower", "variant", "double_fern"))
      );
      a(
         2804,
         a("minecraft:rose_bush", dd),
         a("minecraft:double_plant", Map.of("facing", "east", "half", "lower", "variant", "double_rose")),
         a("minecraft:double_plant", Map.of("facing", "north", "half", "lower", "variant", "double_rose")),
         a("minecraft:double_plant", Map.of("facing", "south", "half", "lower", "variant", "double_rose")),
         a("minecraft:double_plant", Map.of("facing", "west", "half", "lower", "variant", "double_rose"))
      );
      a(
         2805,
         a("minecraft:peony", dd),
         a("minecraft:double_plant", Map.of("facing", "east", "half", "lower", "variant", "paeonia")),
         a("minecraft:double_plant", Map.of("facing", "north", "half", "lower", "variant", "paeonia")),
         a("minecraft:double_plant", Map.of("facing", "south", "half", "lower", "variant", "paeonia")),
         a("minecraft:double_plant", Map.of("facing", "west", "half", "lower", "variant", "paeonia"))
      );
      a(
         2808,
         a("minecraft:peony", dG),
         a("minecraft:double_plant", Map.of("facing", "south", "half", "upper", "variant", "double_fern")),
         a("minecraft:double_plant", Map.of("facing", "south", "half", "upper", "variant", "double_grass")),
         a("minecraft:double_plant", Map.of("facing", "south", "half", "upper", "variant", "double_rose")),
         a("minecraft:double_plant", Map.of("facing", "south", "half", "upper", "variant", "paeonia")),
         a("minecraft:double_plant", Map.of("facing", "south", "half", "upper", "variant", "sunflower")),
         a("minecraft:double_plant", Map.of("facing", "south", "half", "upper", "variant", "syringa"))
      );
      a(
         2809,
         a("minecraft:peony", dG),
         a("minecraft:double_plant", Map.of("facing", "west", "half", "upper", "variant", "double_fern")),
         a("minecraft:double_plant", Map.of("facing", "west", "half", "upper", "variant", "double_grass")),
         a("minecraft:double_plant", Map.of("facing", "west", "half", "upper", "variant", "double_rose")),
         a("minecraft:double_plant", Map.of("facing", "west", "half", "upper", "variant", "paeonia")),
         a("minecraft:double_plant", Map.of("facing", "west", "half", "upper", "variant", "sunflower")),
         a("minecraft:double_plant", Map.of("facing", "west", "half", "upper", "variant", "syringa"))
      );
      a(
         2810,
         a("minecraft:peony", dG),
         a("minecraft:double_plant", Map.of("facing", "north", "half", "upper", "variant", "double_fern")),
         a("minecraft:double_plant", Map.of("facing", "north", "half", "upper", "variant", "double_grass")),
         a("minecraft:double_plant", Map.of("facing", "north", "half", "upper", "variant", "double_rose")),
         a("minecraft:double_plant", Map.of("facing", "north", "half", "upper", "variant", "paeonia")),
         a("minecraft:double_plant", Map.of("facing", "north", "half", "upper", "variant", "sunflower")),
         a("minecraft:double_plant", Map.of("facing", "north", "half", "upper", "variant", "syringa"))
      );
      a(
         2811,
         a("minecraft:peony", dG),
         a("minecraft:double_plant", Map.of("facing", "east", "half", "upper", "variant", "double_fern")),
         a("minecraft:double_plant", Map.of("facing", "east", "half", "upper", "variant", "double_grass")),
         a("minecraft:double_plant", Map.of("facing", "east", "half", "upper", "variant", "double_rose")),
         a("minecraft:double_plant", Map.of("facing", "east", "half", "upper", "variant", "paeonia")),
         a("minecraft:double_plant", Map.of("facing", "east", "half", "upper", "variant", "sunflower")),
         a("minecraft:double_plant", Map.of("facing", "east", "half", "upper", "variant", "syringa"))
      );
   }

   private static void n() {
      a(2816, a("minecraft:white_banner", fz), a("minecraft:standing_banner", fz));
      a(2817, a("minecraft:white_banner", fA), a("minecraft:standing_banner", fA));
      a(2818, a("minecraft:white_banner", fH), a("minecraft:standing_banner", fH));
      a(2819, a("minecraft:white_banner", fI), a("minecraft:standing_banner", fI));
      a(2820, a("minecraft:white_banner", fJ), a("minecraft:standing_banner", fJ));
      a(2821, a("minecraft:white_banner", fK), a("minecraft:standing_banner", fK));
      a(2822, a("minecraft:white_banner", fL), a("minecraft:standing_banner", fL));
      a(2823, a("minecraft:white_banner", fM), a("minecraft:standing_banner", fM));
      a(2824, a("minecraft:white_banner", fN), a("minecraft:standing_banner", fN));
      a(2825, a("minecraft:white_banner", fO), a("minecraft:standing_banner", fO));
      a(2826, a("minecraft:white_banner", fB), a("minecraft:standing_banner", fB));
      a(2827, a("minecraft:white_banner", fC), a("minecraft:standing_banner", fC));
      a(2828, a("minecraft:white_banner", fD), a("minecraft:standing_banner", fD));
      a(2829, a("minecraft:white_banner", fE), a("minecraft:standing_banner", fE));
      a(2830, a("minecraft:white_banner", fF), a("minecraft:standing_banner", fF));
      a(2831, a("minecraft:white_banner", fG), a("minecraft:standing_banner", fG));
      a(2834, a("minecraft:white_wall_banner", bd), a("minecraft:wall_banner", bd));
      a(2835, a("minecraft:white_wall_banner", bA), a("minecraft:wall_banner", bA));
      a(2836, a("minecraft:white_wall_banner", ce), a("minecraft:wall_banner", ce));
      a(2837, a("minecraft:white_wall_banner", aG), a("minecraft:wall_banner", aG));
      a(2848, a("minecraft:daylight_detector", Map.of("inverted", "true", "power", "0")), a("minecraft:daylight_detector_inverted", fj));
      a(2849, a("minecraft:daylight_detector", Map.of("inverted", "true", "power", "1")), a("minecraft:daylight_detector_inverted", fk));
      a(2850, a("minecraft:daylight_detector", Map.of("inverted", "true", "power", "2")), a("minecraft:daylight_detector_inverted", fr));
      a(2851, a("minecraft:daylight_detector", Map.of("inverted", "true", "power", "3")), a("minecraft:daylight_detector_inverted", fs));
      a(2852, a("minecraft:daylight_detector", Map.of("inverted", "true", "power", "4")), a("minecraft:daylight_detector_inverted", ft));
      a(2853, a("minecraft:daylight_detector", Map.of("inverted", "true", "power", "5")), a("minecraft:daylight_detector_inverted", fu));
      a(2854, a("minecraft:daylight_detector", Map.of("inverted", "true", "power", "6")), a("minecraft:daylight_detector_inverted", fv));
      a(2855, a("minecraft:daylight_detector", Map.of("inverted", "true", "power", "7")), a("minecraft:daylight_detector_inverted", fw));
      a(2856, a("minecraft:daylight_detector", Map.of("inverted", "true", "power", "8")), a("minecraft:daylight_detector_inverted", fx));
      a(2857, a("minecraft:daylight_detector", Map.of("inverted", "true", "power", "9")), a("minecraft:daylight_detector_inverted", fy));
      a(2858, a("minecraft:daylight_detector", Map.of("inverted", "true", "power", "10")), a("minecraft:daylight_detector_inverted", fl));
      a(2859, a("minecraft:daylight_detector", Map.of("inverted", "true", "power", "11")), a("minecraft:daylight_detector_inverted", fm));
      a(2860, a("minecraft:daylight_detector", Map.of("inverted", "true", "power", "12")), a("minecraft:daylight_detector_inverted", fn));
      a(2861, a("minecraft:daylight_detector", Map.of("inverted", "true", "power", "13")), a("minecraft:daylight_detector_inverted", fo));
      a(2862, a("minecraft:daylight_detector", Map.of("inverted", "true", "power", "14")), a("minecraft:daylight_detector_inverted", fp));
      a(2863, a("minecraft:daylight_detector", Map.of("inverted", "true", "power", "15")), a("minecraft:daylight_detector_inverted", fq));
      a(2864, b("minecraft:red_sandstone"), a("minecraft:red_sandstone", Map.of("type", "red_sandstone")));
      a(2865, b("minecraft:chiseled_red_sandstone"), a("minecraft:red_sandstone", Map.of("type", "chiseled_red_sandstone")));
      a(2866, b("minecraft:cut_red_sandstone"), a("minecraft:red_sandstone", Map.of("type", "smooth_red_sandstone")));
      a(
         2880,
         a("minecraft:red_sandstone_stairs", cZ),
         a("minecraft:red_sandstone_stairs", cJ),
         a("minecraft:red_sandstone_stairs", cN),
         a("minecraft:red_sandstone_stairs", cR),
         a("minecraft:red_sandstone_stairs", cV),
         a("minecraft:red_sandstone_stairs", cZ)
      );
      a(
         2881,
         a("minecraft:red_sandstone_stairs", dc),
         a("minecraft:red_sandstone_stairs", cM),
         a("minecraft:red_sandstone_stairs", cQ),
         a("minecraft:red_sandstone_stairs", cU),
         a("minecraft:red_sandstone_stairs", cY),
         a("minecraft:red_sandstone_stairs", dc)
      );
      a(
         2882,
         a("minecraft:red_sandstone_stairs", db),
         a("minecraft:red_sandstone_stairs", cL),
         a("minecraft:red_sandstone_stairs", cP),
         a("minecraft:red_sandstone_stairs", cT),
         a("minecraft:red_sandstone_stairs", cX),
         a("minecraft:red_sandstone_stairs", db)
      );
      a(
         2883,
         a("minecraft:red_sandstone_stairs", da),
         a("minecraft:red_sandstone_stairs", cK),
         a("minecraft:red_sandstone_stairs", cO),
         a("minecraft:red_sandstone_stairs", cS),
         a("minecraft:red_sandstone_stairs", cW),
         a("minecraft:red_sandstone_stairs", da)
      );
      a(
         2884,
         a("minecraft:red_sandstone_stairs", dC),
         a("minecraft:red_sandstone_stairs", dm),
         a("minecraft:red_sandstone_stairs", dq),
         a("minecraft:red_sandstone_stairs", du),
         a("minecraft:red_sandstone_stairs", dy),
         a("minecraft:red_sandstone_stairs", dC)
      );
      a(
         2885,
         a("minecraft:red_sandstone_stairs", dF),
         a("minecraft:red_sandstone_stairs", dp),
         a("minecraft:red_sandstone_stairs", dt),
         a("minecraft:red_sandstone_stairs", dx),
         a("minecraft:red_sandstone_stairs", dB),
         a("minecraft:red_sandstone_stairs", dF)
      );
      a(
         2886,
         a("minecraft:red_sandstone_stairs", dE),
         a("minecraft:red_sandstone_stairs", do),
         a("minecraft:red_sandstone_stairs", ds),
         a("minecraft:red_sandstone_stairs", dw),
         a("minecraft:red_sandstone_stairs", dA),
         a("minecraft:red_sandstone_stairs", dE)
      );
      a(
         2887,
         a("minecraft:red_sandstone_stairs", dD),
         a("minecraft:red_sandstone_stairs", dn),
         a("minecraft:red_sandstone_stairs", dr),
         a("minecraft:red_sandstone_stairs", dv),
         a("minecraft:red_sandstone_stairs", dz),
         a("minecraft:red_sandstone_stairs", dD)
      );
      a(2896, a("minecraft:red_sandstone_slab", gr), a("minecraft:double_stone_slab2", Map.of("seamless", "false", "variant", "red_sandstone")));
      a(2904, b("minecraft:smooth_red_sandstone"), a("minecraft:double_stone_slab2", Map.of("seamless", "true", "variant", "red_sandstone")));
      a(2912, a("minecraft:red_sandstone_slab", gq), a("minecraft:stone_slab2", Map.of("half", "bottom", "variant", "red_sandstone")));
      a(2920, a("minecraft:red_sandstone_slab", gs), a("minecraft:stone_slab2", Map.of("half", "top", "variant", "red_sandstone")));
      a(2928, a("minecraft:spruce_fence_gate", eo), a("minecraft:spruce_fence_gate", eo), a("minecraft:spruce_fence_gate", ew));
      a(2929, a("minecraft:spruce_fence_gate", ep), a("minecraft:spruce_fence_gate", ep), a("minecraft:spruce_fence_gate", ex));
      a(2930, a("minecraft:spruce_fence_gate", en), a("minecraft:spruce_fence_gate", en), a("minecraft:spruce_fence_gate", ev));
      a(2931, a("minecraft:spruce_fence_gate", em), a("minecraft:spruce_fence_gate", em), a("minecraft:spruce_fence_gate", eu));
      a(2932, a("minecraft:spruce_fence_gate", es), a("minecraft:spruce_fence_gate", es), a("minecraft:spruce_fence_gate", eA));
      a(2933, a("minecraft:spruce_fence_gate", et), a("minecraft:spruce_fence_gate", et), a("minecraft:spruce_fence_gate", eB));
      a(2934, a("minecraft:spruce_fence_gate", er), a("minecraft:spruce_fence_gate", er), a("minecraft:spruce_fence_gate", ez));
      a(2935, a("minecraft:spruce_fence_gate", eq), a("minecraft:spruce_fence_gate", eq), a("minecraft:spruce_fence_gate", ey));
      a(2936, a("minecraft:spruce_fence_gate", eN), a("minecraft:spruce_fence_gate", eN), a("minecraft:spruce_fence_gate", eV));
      a(2937, a("minecraft:spruce_fence_gate", eO), a("minecraft:spruce_fence_gate", eO), a("minecraft:spruce_fence_gate", eW));
      a(2938, a("minecraft:spruce_fence_gate", eM), a("minecraft:spruce_fence_gate", eM), a("minecraft:spruce_fence_gate", eU));
      a(2939, a("minecraft:spruce_fence_gate", eL), a("minecraft:spruce_fence_gate", eL), a("minecraft:spruce_fence_gate", eT));
      a(2940, a("minecraft:spruce_fence_gate", eR), a("minecraft:spruce_fence_gate", eR), a("minecraft:spruce_fence_gate", eZ));
      a(2941, a("minecraft:spruce_fence_gate", eS), a("minecraft:spruce_fence_gate", eS), a("minecraft:spruce_fence_gate", fa));
      a(2942, a("minecraft:spruce_fence_gate", eQ), a("minecraft:spruce_fence_gate", eQ), a("minecraft:spruce_fence_gate", eY));
      a(2943, a("minecraft:spruce_fence_gate", eP), a("minecraft:spruce_fence_gate", eP), a("minecraft:spruce_fence_gate", eX));
      a(2944, a("minecraft:birch_fence_gate", eo), a("minecraft:birch_fence_gate", eo), a("minecraft:birch_fence_gate", ew));
      a(2945, a("minecraft:birch_fence_gate", ep), a("minecraft:birch_fence_gate", ep), a("minecraft:birch_fence_gate", ex));
      a(2946, a("minecraft:birch_fence_gate", en), a("minecraft:birch_fence_gate", en), a("minecraft:birch_fence_gate", ev));
      a(2947, a("minecraft:birch_fence_gate", em), a("minecraft:birch_fence_gate", em), a("minecraft:birch_fence_gate", eu));
      a(2948, a("minecraft:birch_fence_gate", es), a("minecraft:birch_fence_gate", es), a("minecraft:birch_fence_gate", eA));
      a(2949, a("minecraft:birch_fence_gate", et), a("minecraft:birch_fence_gate", et), a("minecraft:birch_fence_gate", eB));
      a(2950, a("minecraft:birch_fence_gate", er), a("minecraft:birch_fence_gate", er), a("minecraft:birch_fence_gate", ez));
      a(2951, a("minecraft:birch_fence_gate", eq), a("minecraft:birch_fence_gate", eq), a("minecraft:birch_fence_gate", ey));
      a(2952, a("minecraft:birch_fence_gate", eN), a("minecraft:birch_fence_gate", eN), a("minecraft:birch_fence_gate", eV));
      a(2953, a("minecraft:birch_fence_gate", eO), a("minecraft:birch_fence_gate", eO), a("minecraft:birch_fence_gate", eW));
      a(2954, a("minecraft:birch_fence_gate", eM), a("minecraft:birch_fence_gate", eM), a("minecraft:birch_fence_gate", eU));
      a(2955, a("minecraft:birch_fence_gate", eL), a("minecraft:birch_fence_gate", eL), a("minecraft:birch_fence_gate", eT));
      a(2956, a("minecraft:birch_fence_gate", eR), a("minecraft:birch_fence_gate", eR), a("minecraft:birch_fence_gate", eZ));
      a(2957, a("minecraft:birch_fence_gate", eS), a("minecraft:birch_fence_gate", eS), a("minecraft:birch_fence_gate", fa));
      a(2958, a("minecraft:birch_fence_gate", eQ), a("minecraft:birch_fence_gate", eQ), a("minecraft:birch_fence_gate", eY));
      a(2959, a("minecraft:birch_fence_gate", eP), a("minecraft:birch_fence_gate", eP), a("minecraft:birch_fence_gate", eX));
      a(2960, a("minecraft:jungle_fence_gate", eo), a("minecraft:jungle_fence_gate", eo), a("minecraft:jungle_fence_gate", ew));
      a(2961, a("minecraft:jungle_fence_gate", ep), a("minecraft:jungle_fence_gate", ep), a("minecraft:jungle_fence_gate", ex));
      a(2962, a("minecraft:jungle_fence_gate", en), a("minecraft:jungle_fence_gate", en), a("minecraft:jungle_fence_gate", ev));
      a(2963, a("minecraft:jungle_fence_gate", em), a("minecraft:jungle_fence_gate", em), a("minecraft:jungle_fence_gate", eu));
      a(2964, a("minecraft:jungle_fence_gate", es), a("minecraft:jungle_fence_gate", es), a("minecraft:jungle_fence_gate", eA));
      a(2965, a("minecraft:jungle_fence_gate", et), a("minecraft:jungle_fence_gate", et), a("minecraft:jungle_fence_gate", eB));
      a(2966, a("minecraft:jungle_fence_gate", er), a("minecraft:jungle_fence_gate", er), a("minecraft:jungle_fence_gate", ez));
      a(2967, a("minecraft:jungle_fence_gate", eq), a("minecraft:jungle_fence_gate", eq), a("minecraft:jungle_fence_gate", ey));
      a(2968, a("minecraft:jungle_fence_gate", eN), a("minecraft:jungle_fence_gate", eN), a("minecraft:jungle_fence_gate", eV));
      a(2969, a("minecraft:jungle_fence_gate", eO), a("minecraft:jungle_fence_gate", eO), a("minecraft:jungle_fence_gate", eW));
      a(2970, a("minecraft:jungle_fence_gate", eM), a("minecraft:jungle_fence_gate", eM), a("minecraft:jungle_fence_gate", eU));
      a(2971, a("minecraft:jungle_fence_gate", eL), a("minecraft:jungle_fence_gate", eL), a("minecraft:jungle_fence_gate", eT));
      a(2972, a("minecraft:jungle_fence_gate", eR), a("minecraft:jungle_fence_gate", eR), a("minecraft:jungle_fence_gate", eZ));
      a(2973, a("minecraft:jungle_fence_gate", eS), a("minecraft:jungle_fence_gate", eS), a("minecraft:jungle_fence_gate", fa));
      a(2974, a("minecraft:jungle_fence_gate", eQ), a("minecraft:jungle_fence_gate", eQ), a("minecraft:jungle_fence_gate", eY));
      a(2975, a("minecraft:jungle_fence_gate", eP), a("minecraft:jungle_fence_gate", eP), a("minecraft:jungle_fence_gate", eX));
      a(2976, a("minecraft:dark_oak_fence_gate", eo), a("minecraft:dark_oak_fence_gate", eo), a("minecraft:dark_oak_fence_gate", ew));
      a(2977, a("minecraft:dark_oak_fence_gate", ep), a("minecraft:dark_oak_fence_gate", ep), a("minecraft:dark_oak_fence_gate", ex));
      a(2978, a("minecraft:dark_oak_fence_gate", en), a("minecraft:dark_oak_fence_gate", en), a("minecraft:dark_oak_fence_gate", ev));
      a(2979, a("minecraft:dark_oak_fence_gate", em), a("minecraft:dark_oak_fence_gate", em), a("minecraft:dark_oak_fence_gate", eu));
      a(2980, a("minecraft:dark_oak_fence_gate", es), a("minecraft:dark_oak_fence_gate", es), a("minecraft:dark_oak_fence_gate", eA));
      a(2981, a("minecraft:dark_oak_fence_gate", et), a("minecraft:dark_oak_fence_gate", et), a("minecraft:dark_oak_fence_gate", eB));
      a(2982, a("minecraft:dark_oak_fence_gate", er), a("minecraft:dark_oak_fence_gate", er), a("minecraft:dark_oak_fence_gate", ez));
      a(2983, a("minecraft:dark_oak_fence_gate", eq), a("minecraft:dark_oak_fence_gate", eq), a("minecraft:dark_oak_fence_gate", ey));
      a(2984, a("minecraft:dark_oak_fence_gate", eN), a("minecraft:dark_oak_fence_gate", eN), a("minecraft:dark_oak_fence_gate", eV));
      a(2985, a("minecraft:dark_oak_fence_gate", eO), a("minecraft:dark_oak_fence_gate", eO), a("minecraft:dark_oak_fence_gate", eW));
      a(2986, a("minecraft:dark_oak_fence_gate", eM), a("minecraft:dark_oak_fence_gate", eM), a("minecraft:dark_oak_fence_gate", eU));
      a(2987, a("minecraft:dark_oak_fence_gate", eL), a("minecraft:dark_oak_fence_gate", eL), a("minecraft:dark_oak_fence_gate", eT));
      a(2988, a("minecraft:dark_oak_fence_gate", eR), a("minecraft:dark_oak_fence_gate", eR), a("minecraft:dark_oak_fence_gate", eZ));
      a(2989, a("minecraft:dark_oak_fence_gate", eS), a("minecraft:dark_oak_fence_gate", eS), a("minecraft:dark_oak_fence_gate", fa));
      a(2990, a("minecraft:dark_oak_fence_gate", eQ), a("minecraft:dark_oak_fence_gate", eQ), a("minecraft:dark_oak_fence_gate", eY));
      a(2991, a("minecraft:dark_oak_fence_gate", eP), a("minecraft:dark_oak_fence_gate", eP), a("minecraft:dark_oak_fence_gate", eX));
      a(2992, a("minecraft:acacia_fence_gate", eo), a("minecraft:acacia_fence_gate", eo), a("minecraft:acacia_fence_gate", ew));
      a(2993, a("minecraft:acacia_fence_gate", ep), a("minecraft:acacia_fence_gate", ep), a("minecraft:acacia_fence_gate", ex));
      a(2994, a("minecraft:acacia_fence_gate", en), a("minecraft:acacia_fence_gate", en), a("minecraft:acacia_fence_gate", ev));
      a(2995, a("minecraft:acacia_fence_gate", em), a("minecraft:acacia_fence_gate", em), a("minecraft:acacia_fence_gate", eu));
      a(2996, a("minecraft:acacia_fence_gate", es), a("minecraft:acacia_fence_gate", es), a("minecraft:acacia_fence_gate", eA));
      a(2997, a("minecraft:acacia_fence_gate", et), a("minecraft:acacia_fence_gate", et), a("minecraft:acacia_fence_gate", eB));
      a(2998, a("minecraft:acacia_fence_gate", er), a("minecraft:acacia_fence_gate", er), a("minecraft:acacia_fence_gate", ez));
      a(2999, a("minecraft:acacia_fence_gate", eq), a("minecraft:acacia_fence_gate", eq), a("minecraft:acacia_fence_gate", ey));
      a(3000, a("minecraft:acacia_fence_gate", eN), a("minecraft:acacia_fence_gate", eN), a("minecraft:acacia_fence_gate", eV));
      a(3001, a("minecraft:acacia_fence_gate", eO), a("minecraft:acacia_fence_gate", eO), a("minecraft:acacia_fence_gate", eW));
      a(3002, a("minecraft:acacia_fence_gate", eM), a("minecraft:acacia_fence_gate", eM), a("minecraft:acacia_fence_gate", eU));
      a(3003, a("minecraft:acacia_fence_gate", eL), a("minecraft:acacia_fence_gate", eL), a("minecraft:acacia_fence_gate", eT));
      a(3004, a("minecraft:acacia_fence_gate", eR), a("minecraft:acacia_fence_gate", eR), a("minecraft:acacia_fence_gate", eZ));
      a(3005, a("minecraft:acacia_fence_gate", eS), a("minecraft:acacia_fence_gate", eS), a("minecraft:acacia_fence_gate", fa));
      a(3006, a("minecraft:acacia_fence_gate", eQ), a("minecraft:acacia_fence_gate", eQ), a("minecraft:acacia_fence_gate", eY));
      a(3007, a("minecraft:acacia_fence_gate", eP), a("minecraft:acacia_fence_gate", eP), a("minecraft:acacia_fence_gate", eX));
      a(
         3008,
         a("minecraft:spruce_fence", gu),
         a("minecraft:spruce_fence", gu),
         a("minecraft:spruce_fence", gC),
         a("minecraft:spruce_fence", gw),
         a("minecraft:spruce_fence", gE),
         a("minecraft:spruce_fence", gy),
         a("minecraft:spruce_fence", gG),
         a("minecraft:spruce_fence", gA),
         a("minecraft:spruce_fence", gI),
         a("minecraft:spruce_fence", gv),
         a("minecraft:spruce_fence", gD),
         a("minecraft:spruce_fence", gx),
         a("minecraft:spruce_fence", gF),
         a("minecraft:spruce_fence", gz),
         a("minecraft:spruce_fence", gH),
         a("minecraft:spruce_fence", gB),
         a("minecraft:spruce_fence", gJ)
      );
      a(
         3024,
         a("minecraft:birch_fence", gu),
         a("minecraft:birch_fence", gu),
         a("minecraft:birch_fence", gC),
         a("minecraft:birch_fence", gw),
         a("minecraft:birch_fence", gE),
         a("minecraft:birch_fence", gy),
         a("minecraft:birch_fence", gG),
         a("minecraft:birch_fence", gA),
         a("minecraft:birch_fence", gI),
         a("minecraft:birch_fence", gv),
         a("minecraft:birch_fence", gD),
         a("minecraft:birch_fence", gx),
         a("minecraft:birch_fence", gF),
         a("minecraft:birch_fence", gz),
         a("minecraft:birch_fence", gH),
         a("minecraft:birch_fence", gB),
         a("minecraft:birch_fence", gJ)
      );
      a(
         3040,
         a("minecraft:jungle_fence", gu),
         a("minecraft:jungle_fence", gu),
         a("minecraft:jungle_fence", gC),
         a("minecraft:jungle_fence", gw),
         a("minecraft:jungle_fence", gE),
         a("minecraft:jungle_fence", gy),
         a("minecraft:jungle_fence", gG),
         a("minecraft:jungle_fence", gA),
         a("minecraft:jungle_fence", gI),
         a("minecraft:jungle_fence", gv),
         a("minecraft:jungle_fence", gD),
         a("minecraft:jungle_fence", gx),
         a("minecraft:jungle_fence", gF),
         a("minecraft:jungle_fence", gz),
         a("minecraft:jungle_fence", gH),
         a("minecraft:jungle_fence", gB),
         a("minecraft:jungle_fence", gJ)
      );
      a(
         3056,
         a("minecraft:dark_oak_fence", gu),
         a("minecraft:dark_oak_fence", gu),
         a("minecraft:dark_oak_fence", gC),
         a("minecraft:dark_oak_fence", gw),
         a("minecraft:dark_oak_fence", gE),
         a("minecraft:dark_oak_fence", gy),
         a("minecraft:dark_oak_fence", gG),
         a("minecraft:dark_oak_fence", gA),
         a("minecraft:dark_oak_fence", gI),
         a("minecraft:dark_oak_fence", gv),
         a("minecraft:dark_oak_fence", gD),
         a("minecraft:dark_oak_fence", gx),
         a("minecraft:dark_oak_fence", gF),
         a("minecraft:dark_oak_fence", gz),
         a("minecraft:dark_oak_fence", gH),
         a("minecraft:dark_oak_fence", gB),
         a("minecraft:dark_oak_fence", gJ)
      );
   }

   private static void o() {
      a(
         3072,
         a("minecraft:acacia_fence", gu),
         a("minecraft:acacia_fence", gu),
         a("minecraft:acacia_fence", gC),
         a("minecraft:acacia_fence", gw),
         a("minecraft:acacia_fence", gE),
         a("minecraft:acacia_fence", gy),
         a("minecraft:acacia_fence", gG),
         a("minecraft:acacia_fence", gA),
         a("minecraft:acacia_fence", gI),
         a("minecraft:acacia_fence", gv),
         a("minecraft:acacia_fence", gD),
         a("minecraft:acacia_fence", gx),
         a("minecraft:acacia_fence", gF),
         a("minecraft:acacia_fence", gz),
         a("minecraft:acacia_fence", gH),
         a("minecraft:acacia_fence", gB),
         a("minecraft:acacia_fence", gJ)
      );
      a(
         3088,
         a("minecraft:spruce_door", aN),
         a("minecraft:spruce_door", aL),
         a("minecraft:spruce_door", aP),
         a("minecraft:spruce_door", aN),
         a("minecraft:spruce_door", aR)
      );
      a(
         3089,
         a("minecraft:spruce_door", bH),
         a("minecraft:spruce_door", bF),
         a("minecraft:spruce_door", bJ),
         a("minecraft:spruce_door", bH),
         a("minecraft:spruce_door", bL)
      );
      a(
         3090,
         a("minecraft:spruce_door", cl),
         a("minecraft:spruce_door", cj),
         a("minecraft:spruce_door", cn),
         a("minecraft:spruce_door", cl),
         a("minecraft:spruce_door", cp)
      );
      a(
         3091,
         a("minecraft:spruce_door", bk),
         a("minecraft:spruce_door", bi),
         a("minecraft:spruce_door", bm),
         a("minecraft:spruce_door", bk),
         a("minecraft:spruce_door", bo)
      );
      a(
         3092,
         a("minecraft:spruce_door", aV),
         a("minecraft:spruce_door", aT),
         a("minecraft:spruce_door", aX),
         a("minecraft:spruce_door", aV),
         a("minecraft:spruce_door", aZ)
      );
      a(
         3093,
         a("minecraft:spruce_door", bP),
         a("minecraft:spruce_door", bN),
         a("minecraft:spruce_door", bR),
         a("minecraft:spruce_door", bP),
         a("minecraft:spruce_door", bT)
      );
      a(
         3094,
         a("minecraft:spruce_door", ct),
         a("minecraft:spruce_door", cr),
         a("minecraft:spruce_door", cv),
         a("minecraft:spruce_door", ct),
         a("minecraft:spruce_door", cx)
      );
      a(
         3095,
         a("minecraft:spruce_door", bs),
         a("minecraft:spruce_door", bq),
         a("minecraft:spruce_door", bu),
         a("minecraft:spruce_door", bs),
         a("minecraft:spruce_door", bw)
      );
      a(
         3096,
         a("minecraft:spruce_door", aM),
         a("minecraft:spruce_door", aM),
         a("minecraft:spruce_door", aU),
         a("minecraft:spruce_door", bj),
         a("minecraft:spruce_door", br),
         a("minecraft:spruce_door", bG),
         a("minecraft:spruce_door", bO),
         a("minecraft:spruce_door", ck),
         a("minecraft:spruce_door", cs)
      );
      a(
         3097,
         a("minecraft:spruce_door", aO),
         a("minecraft:spruce_door", aO),
         a("minecraft:spruce_door", aW),
         a("minecraft:spruce_door", bl),
         a("minecraft:spruce_door", bt),
         a("minecraft:spruce_door", bI),
         a("minecraft:spruce_door", bQ),
         a("minecraft:spruce_door", cm),
         a("minecraft:spruce_door", cu)
      );
      a(
         3098,
         a("minecraft:spruce_door", aQ),
         a("minecraft:spruce_door", aQ),
         a("minecraft:spruce_door", aY),
         a("minecraft:spruce_door", bn),
         a("minecraft:spruce_door", bv),
         a("minecraft:spruce_door", bK),
         a("minecraft:spruce_door", bS),
         a("minecraft:spruce_door", co),
         a("minecraft:spruce_door", cw)
      );
      a(
         3099,
         a("minecraft:spruce_door", aS),
         a("minecraft:spruce_door", aS),
         a("minecraft:spruce_door", ba),
         a("minecraft:spruce_door", bp),
         a("minecraft:spruce_door", bx),
         a("minecraft:spruce_door", bM),
         a("minecraft:spruce_door", bU),
         a("minecraft:spruce_door", cq),
         a("minecraft:spruce_door", cy)
      );
      a(
         3104,
         a("minecraft:birch_door", aN),
         a("minecraft:birch_door", aL),
         a("minecraft:birch_door", aP),
         a("minecraft:birch_door", aN),
         a("minecraft:birch_door", aR)
      );
      a(
         3105,
         a("minecraft:birch_door", bH),
         a("minecraft:birch_door", bF),
         a("minecraft:birch_door", bJ),
         a("minecraft:birch_door", bH),
         a("minecraft:birch_door", bL)
      );
      a(
         3106,
         a("minecraft:birch_door", cl),
         a("minecraft:birch_door", cj),
         a("minecraft:birch_door", cn),
         a("minecraft:birch_door", cl),
         a("minecraft:birch_door", cp)
      );
      a(
         3107,
         a("minecraft:birch_door", bk),
         a("minecraft:birch_door", bi),
         a("minecraft:birch_door", bm),
         a("minecraft:birch_door", bk),
         a("minecraft:birch_door", bo)
      );
      a(
         3108,
         a("minecraft:birch_door", aV),
         a("minecraft:birch_door", aT),
         a("minecraft:birch_door", aX),
         a("minecraft:birch_door", aV),
         a("minecraft:birch_door", aZ)
      );
      a(
         3109,
         a("minecraft:birch_door", bP),
         a("minecraft:birch_door", bN),
         a("minecraft:birch_door", bR),
         a("minecraft:birch_door", bP),
         a("minecraft:birch_door", bT)
      );
      a(
         3110,
         a("minecraft:birch_door", ct),
         a("minecraft:birch_door", cr),
         a("minecraft:birch_door", cv),
         a("minecraft:birch_door", ct),
         a("minecraft:birch_door", cx)
      );
      a(
         3111,
         a("minecraft:birch_door", bs),
         a("minecraft:birch_door", bq),
         a("minecraft:birch_door", bu),
         a("minecraft:birch_door", bs),
         a("minecraft:birch_door", bw)
      );
      a(
         3112,
         a("minecraft:birch_door", aM),
         a("minecraft:birch_door", aM),
         a("minecraft:birch_door", aU),
         a("minecraft:birch_door", bj),
         a("minecraft:birch_door", br),
         a("minecraft:birch_door", bG),
         a("minecraft:birch_door", bO),
         a("minecraft:birch_door", ck),
         a("minecraft:birch_door", cs)
      );
      a(
         3113,
         a("minecraft:birch_door", aO),
         a("minecraft:birch_door", aO),
         a("minecraft:birch_door", aW),
         a("minecraft:birch_door", bl),
         a("minecraft:birch_door", bt),
         a("minecraft:birch_door", bI),
         a("minecraft:birch_door", bQ),
         a("minecraft:birch_door", cm),
         a("minecraft:birch_door", cu)
      );
      a(
         3114,
         a("minecraft:birch_door", aQ),
         a("minecraft:birch_door", aQ),
         a("minecraft:birch_door", aY),
         a("minecraft:birch_door", bn),
         a("minecraft:birch_door", bv),
         a("minecraft:birch_door", bK),
         a("minecraft:birch_door", bS),
         a("minecraft:birch_door", co),
         a("minecraft:birch_door", cw)
      );
      a(
         3115,
         a("minecraft:birch_door", aS),
         a("minecraft:birch_door", aS),
         a("minecraft:birch_door", ba),
         a("minecraft:birch_door", bp),
         a("minecraft:birch_door", bx),
         a("minecraft:birch_door", bM),
         a("minecraft:birch_door", bU),
         a("minecraft:birch_door", cq),
         a("minecraft:birch_door", cy)
      );
      a(
         3120,
         a("minecraft:jungle_door", aN),
         a("minecraft:jungle_door", aL),
         a("minecraft:jungle_door", aP),
         a("minecraft:jungle_door", aN),
         a("minecraft:jungle_door", aR)
      );
      a(
         3121,
         a("minecraft:jungle_door", bH),
         a("minecraft:jungle_door", bF),
         a("minecraft:jungle_door", bJ),
         a("minecraft:jungle_door", bH),
         a("minecraft:jungle_door", bL)
      );
      a(
         3122,
         a("minecraft:jungle_door", cl),
         a("minecraft:jungle_door", cj),
         a("minecraft:jungle_door", cn),
         a("minecraft:jungle_door", cl),
         a("minecraft:jungle_door", cp)
      );
      a(
         3123,
         a("minecraft:jungle_door", bk),
         a("minecraft:jungle_door", bi),
         a("minecraft:jungle_door", bm),
         a("minecraft:jungle_door", bk),
         a("minecraft:jungle_door", bo)
      );
      a(
         3124,
         a("minecraft:jungle_door", aV),
         a("minecraft:jungle_door", aT),
         a("minecraft:jungle_door", aX),
         a("minecraft:jungle_door", aV),
         a("minecraft:jungle_door", aZ)
      );
      a(
         3125,
         a("minecraft:jungle_door", bP),
         a("minecraft:jungle_door", bN),
         a("minecraft:jungle_door", bR),
         a("minecraft:jungle_door", bP),
         a("minecraft:jungle_door", bT)
      );
      a(
         3126,
         a("minecraft:jungle_door", ct),
         a("minecraft:jungle_door", cr),
         a("minecraft:jungle_door", cv),
         a("minecraft:jungle_door", ct),
         a("minecraft:jungle_door", cx)
      );
      a(
         3127,
         a("minecraft:jungle_door", bs),
         a("minecraft:jungle_door", bq),
         a("minecraft:jungle_door", bu),
         a("minecraft:jungle_door", bs),
         a("minecraft:jungle_door", bw)
      );
      a(
         3128,
         a("minecraft:jungle_door", aM),
         a("minecraft:jungle_door", aM),
         a("minecraft:jungle_door", aU),
         a("minecraft:jungle_door", bj),
         a("minecraft:jungle_door", br),
         a("minecraft:jungle_door", bG),
         a("minecraft:jungle_door", bO),
         a("minecraft:jungle_door", ck),
         a("minecraft:jungle_door", cs)
      );
      a(
         3129,
         a("minecraft:jungle_door", aO),
         a("minecraft:jungle_door", aO),
         a("minecraft:jungle_door", aW),
         a("minecraft:jungle_door", bl),
         a("minecraft:jungle_door", bt),
         a("minecraft:jungle_door", bI),
         a("minecraft:jungle_door", bQ),
         a("minecraft:jungle_door", cm),
         a("minecraft:jungle_door", cu)
      );
      a(
         3130,
         a("minecraft:jungle_door", aQ),
         a("minecraft:jungle_door", aQ),
         a("minecraft:jungle_door", aY),
         a("minecraft:jungle_door", bn),
         a("minecraft:jungle_door", bv),
         a("minecraft:jungle_door", bK),
         a("minecraft:jungle_door", bS),
         a("minecraft:jungle_door", co),
         a("minecraft:jungle_door", cw)
      );
      a(
         3131,
         a("minecraft:jungle_door", aS),
         a("minecraft:jungle_door", aS),
         a("minecraft:jungle_door", ba),
         a("minecraft:jungle_door", bp),
         a("minecraft:jungle_door", bx),
         a("minecraft:jungle_door", bM),
         a("minecraft:jungle_door", bU),
         a("minecraft:jungle_door", cq),
         a("minecraft:jungle_door", cy)
      );
      a(
         3136,
         a("minecraft:acacia_door", aN),
         a("minecraft:acacia_door", aL),
         a("minecraft:acacia_door", aP),
         a("minecraft:acacia_door", aN),
         a("minecraft:acacia_door", aR)
      );
      a(
         3137,
         a("minecraft:acacia_door", bH),
         a("minecraft:acacia_door", bF),
         a("minecraft:acacia_door", bJ),
         a("minecraft:acacia_door", bH),
         a("minecraft:acacia_door", bL)
      );
      a(
         3138,
         a("minecraft:acacia_door", cl),
         a("minecraft:acacia_door", cj),
         a("minecraft:acacia_door", cn),
         a("minecraft:acacia_door", cl),
         a("minecraft:acacia_door", cp)
      );
      a(
         3139,
         a("minecraft:acacia_door", bk),
         a("minecraft:acacia_door", bi),
         a("minecraft:acacia_door", bm),
         a("minecraft:acacia_door", bk),
         a("minecraft:acacia_door", bo)
      );
      a(
         3140,
         a("minecraft:acacia_door", aV),
         a("minecraft:acacia_door", aT),
         a("minecraft:acacia_door", aX),
         a("minecraft:acacia_door", aV),
         a("minecraft:acacia_door", aZ)
      );
      a(
         3141,
         a("minecraft:acacia_door", bP),
         a("minecraft:acacia_door", bN),
         a("minecraft:acacia_door", bR),
         a("minecraft:acacia_door", bP),
         a("minecraft:acacia_door", bT)
      );
      a(
         3142,
         a("minecraft:acacia_door", ct),
         a("minecraft:acacia_door", cr),
         a("minecraft:acacia_door", cv),
         a("minecraft:acacia_door", ct),
         a("minecraft:acacia_door", cx)
      );
      a(
         3143,
         a("minecraft:acacia_door", bs),
         a("minecraft:acacia_door", bq),
         a("minecraft:acacia_door", bu),
         a("minecraft:acacia_door", bs),
         a("minecraft:acacia_door", bw)
      );
      a(
         3144,
         a("minecraft:acacia_door", aM),
         a("minecraft:acacia_door", aM),
         a("minecraft:acacia_door", aU),
         a("minecraft:acacia_door", bj),
         a("minecraft:acacia_door", br),
         a("minecraft:acacia_door", bG),
         a("minecraft:acacia_door", bO),
         a("minecraft:acacia_door", ck),
         a("minecraft:acacia_door", cs)
      );
      a(
         3145,
         a("minecraft:acacia_door", aO),
         a("minecraft:acacia_door", aO),
         a("minecraft:acacia_door", aW),
         a("minecraft:acacia_door", bl),
         a("minecraft:acacia_door", bt),
         a("minecraft:acacia_door", bI),
         a("minecraft:acacia_door", bQ),
         a("minecraft:acacia_door", cm),
         a("minecraft:acacia_door", cu)
      );
      a(
         3146,
         a("minecraft:acacia_door", aQ),
         a("minecraft:acacia_door", aQ),
         a("minecraft:acacia_door", aY),
         a("minecraft:acacia_door", bn),
         a("minecraft:acacia_door", bv),
         a("minecraft:acacia_door", bK),
         a("minecraft:acacia_door", bS),
         a("minecraft:acacia_door", co),
         a("minecraft:acacia_door", cw)
      );
      a(
         3147,
         a("minecraft:acacia_door", aS),
         a("minecraft:acacia_door", aS),
         a("minecraft:acacia_door", ba),
         a("minecraft:acacia_door", bp),
         a("minecraft:acacia_door", bx),
         a("minecraft:acacia_door", bM),
         a("minecraft:acacia_door", bU),
         a("minecraft:acacia_door", cq),
         a("minecraft:acacia_door", cy)
      );
      a(
         3152,
         a("minecraft:dark_oak_door", aN),
         a("minecraft:dark_oak_door", aL),
         a("minecraft:dark_oak_door", aP),
         a("minecraft:dark_oak_door", aN),
         a("minecraft:dark_oak_door", aR)
      );
      a(
         3153,
         a("minecraft:dark_oak_door", bH),
         a("minecraft:dark_oak_door", bF),
         a("minecraft:dark_oak_door", bJ),
         a("minecraft:dark_oak_door", bH),
         a("minecraft:dark_oak_door", bL)
      );
      a(
         3154,
         a("minecraft:dark_oak_door", cl),
         a("minecraft:dark_oak_door", cj),
         a("minecraft:dark_oak_door", cn),
         a("minecraft:dark_oak_door", cl),
         a("minecraft:dark_oak_door", cp)
      );
      a(
         3155,
         a("minecraft:dark_oak_door", bk),
         a("minecraft:dark_oak_door", bi),
         a("minecraft:dark_oak_door", bm),
         a("minecraft:dark_oak_door", bk),
         a("minecraft:dark_oak_door", bo)
      );
      a(
         3156,
         a("minecraft:dark_oak_door", aV),
         a("minecraft:dark_oak_door", aT),
         a("minecraft:dark_oak_door", aX),
         a("minecraft:dark_oak_door", aV),
         a("minecraft:dark_oak_door", aZ)
      );
      a(
         3157,
         a("minecraft:dark_oak_door", bP),
         a("minecraft:dark_oak_door", bN),
         a("minecraft:dark_oak_door", bR),
         a("minecraft:dark_oak_door", bP),
         a("minecraft:dark_oak_door", bT)
      );
      a(
         3158,
         a("minecraft:dark_oak_door", ct),
         a("minecraft:dark_oak_door", cr),
         a("minecraft:dark_oak_door", cv),
         a("minecraft:dark_oak_door", ct),
         a("minecraft:dark_oak_door", cx)
      );
      a(
         3159,
         a("minecraft:dark_oak_door", bs),
         a("minecraft:dark_oak_door", bq),
         a("minecraft:dark_oak_door", bu),
         a("minecraft:dark_oak_door", bs),
         a("minecraft:dark_oak_door", bw)
      );
      a(
         3160,
         a("minecraft:dark_oak_door", aM),
         a("minecraft:dark_oak_door", aM),
         a("minecraft:dark_oak_door", aU),
         a("minecraft:dark_oak_door", bj),
         a("minecraft:dark_oak_door", br),
         a("minecraft:dark_oak_door", bG),
         a("minecraft:dark_oak_door", bO),
         a("minecraft:dark_oak_door", ck),
         a("minecraft:dark_oak_door", cs)
      );
      a(
         3161,
         a("minecraft:dark_oak_door", aO),
         a("minecraft:dark_oak_door", aO),
         a("minecraft:dark_oak_door", aW),
         a("minecraft:dark_oak_door", bl),
         a("minecraft:dark_oak_door", bt),
         a("minecraft:dark_oak_door", bI),
         a("minecraft:dark_oak_door", bQ),
         a("minecraft:dark_oak_door", cm),
         a("minecraft:dark_oak_door", cu)
      );
      a(
         3162,
         a("minecraft:dark_oak_door", aQ),
         a("minecraft:dark_oak_door", aQ),
         a("minecraft:dark_oak_door", aY),
         a("minecraft:dark_oak_door", bn),
         a("minecraft:dark_oak_door", bv),
         a("minecraft:dark_oak_door", bK),
         a("minecraft:dark_oak_door", bS),
         a("minecraft:dark_oak_door", co),
         a("minecraft:dark_oak_door", cw)
      );
      a(
         3163,
         a("minecraft:dark_oak_door", aS),
         a("minecraft:dark_oak_door", aS),
         a("minecraft:dark_oak_door", ba),
         a("minecraft:dark_oak_door", bp),
         a("minecraft:dark_oak_door", bx),
         a("minecraft:dark_oak_door", bM),
         a("minecraft:dark_oak_door", bU),
         a("minecraft:dark_oak_door", cq),
         a("minecraft:dark_oak_door", cy)
      );
      a(3168, a("minecraft:end_rod", az), a("minecraft:end_rod", az));
      a(3169, a("minecraft:end_rod", bX), a("minecraft:end_rod", bX));
      a(3170, a("minecraft:end_rod", bd), a("minecraft:end_rod", bd));
      a(3171, a("minecraft:end_rod", bA), a("minecraft:end_rod", bA));
      a(3172, a("minecraft:end_rod", ce), a("minecraft:end_rod", ce));
      a(3173, a("minecraft:end_rod", aG), a("minecraft:end_rod", aG));
      a(
         3184,
         a("minecraft:chorus_plant", dZ),
         a("minecraft:chorus_plant", dZ),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:chorus_plant", ea),
         a("minecraft:chorus_plant", ec),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:chorus_plant", eb),
         a("minecraft:chorus_plant", ed),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:chorus_plant", eg),
         a("minecraft:chorus_plant", eh),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:chorus_plant", ee),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:chorus_plant", ef),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:chorus_plant", ej),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:chorus_plant", ei),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "false", "east", "true", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "false", "north", "true", "south", "true", "up", "true", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "false", "south", "false", "up", "false", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "false", "south", "false", "up", "false", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "false", "south", "false", "up", "true", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "false", "south", "false", "up", "true", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "false", "south", "true", "up", "false", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "false", "south", "true", "up", "false", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "false", "south", "true", "up", "true", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "false", "south", "true", "up", "true", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "true", "south", "false", "up", "false", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "true", "south", "false", "up", "false", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "true", "south", "false", "up", "true", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "true", "south", "false", "up", "true", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "true", "south", "true", "up", "false", "west", "false")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "true", "south", "true", "up", "false", "west", "true")),
         a("minecraft:chorus_plant", Map.of("down", "true", "east", "true", "north", "true", "south", "true", "up", "true", "west", "false")),
         a("minecraft:chorus_plant", ek)
      );
      a(3200, a("minecraft:chorus_flower", h), a("minecraft:chorus_flower", h));
      a(3201, a("minecraft:chorus_flower", m), a("minecraft:chorus_flower", m));
      a(3202, a("minecraft:chorus_flower", x), a("minecraft:chorus_flower", x));
      a(3203, a("minecraft:chorus_flower", C), a("minecraft:chorus_flower", C));
      a(3204, a("minecraft:chorus_flower", D), a("minecraft:chorus_flower", D));
      a(3205, a("minecraft:chorus_flower", E), a("minecraft:chorus_flower", E));
      a(3216, b("minecraft:purpur_block"), b("minecraft:purpur_block"));
      a(3232, a("minecraft:purpur_pillar", K), a("minecraft:purpur_pillar", K));
      a(3236, a("minecraft:purpur_pillar", J), a("minecraft:purpur_pillar", J));
      a(3240, a("minecraft:purpur_pillar", L), a("minecraft:purpur_pillar", L));
      a(
         3248,
         a("minecraft:purpur_stairs", cZ),
         a("minecraft:purpur_stairs", cJ),
         a("minecraft:purpur_stairs", cN),
         a("minecraft:purpur_stairs", cR),
         a("minecraft:purpur_stairs", cV),
         a("minecraft:purpur_stairs", cZ)
      );
      a(
         3249,
         a("minecraft:purpur_stairs", dc),
         a("minecraft:purpur_stairs", cM),
         a("minecraft:purpur_stairs", cQ),
         a("minecraft:purpur_stairs", cU),
         a("minecraft:purpur_stairs", cY),
         a("minecraft:purpur_stairs", dc)
      );
      a(
         3250,
         a("minecraft:purpur_stairs", db),
         a("minecraft:purpur_stairs", cL),
         a("minecraft:purpur_stairs", cP),
         a("minecraft:purpur_stairs", cT),
         a("minecraft:purpur_stairs", cX),
         a("minecraft:purpur_stairs", db)
      );
      a(
         3251,
         a("minecraft:purpur_stairs", da),
         a("minecraft:purpur_stairs", cK),
         a("minecraft:purpur_stairs", cO),
         a("minecraft:purpur_stairs", cS),
         a("minecraft:purpur_stairs", cW),
         a("minecraft:purpur_stairs", da)
      );
      a(
         3252,
         a("minecraft:purpur_stairs", dC),
         a("minecraft:purpur_stairs", dm),
         a("minecraft:purpur_stairs", dq),
         a("minecraft:purpur_stairs", du),
         a("minecraft:purpur_stairs", dy),
         a("minecraft:purpur_stairs", dC)
      );
      a(
         3253,
         a("minecraft:purpur_stairs", dF),
         a("minecraft:purpur_stairs", dp),
         a("minecraft:purpur_stairs", dt),
         a("minecraft:purpur_stairs", dx),
         a("minecraft:purpur_stairs", dB),
         a("minecraft:purpur_stairs", dF)
      );
      a(
         3254,
         a("minecraft:purpur_stairs", dE),
         a("minecraft:purpur_stairs", do),
         a("minecraft:purpur_stairs", ds),
         a("minecraft:purpur_stairs", dw),
         a("minecraft:purpur_stairs", dA),
         a("minecraft:purpur_stairs", dE)
      );
      a(
         3255,
         a("minecraft:purpur_stairs", dD),
         a("minecraft:purpur_stairs", dn),
         a("minecraft:purpur_stairs", dr),
         a("minecraft:purpur_stairs", dv),
         a("minecraft:purpur_stairs", dz),
         a("minecraft:purpur_stairs", dD)
      );
      a(3264, a("minecraft:purpur_slab", gr), a("minecraft:purpur_double_slab", Map.of("variant", "default")));
      a(3280, a("minecraft:purpur_slab", gq), a("minecraft:purpur_slab", Map.of("half", "bottom", "variant", "default")));
      a(3288, a("minecraft:purpur_slab", gs), a("minecraft:purpur_slab", Map.of("half", "top", "variant", "default")));
      a(3296, b("minecraft:end_stone_bricks"), b("minecraft:end_bricks"));
      a(3312, a("minecraft:beetroots", h), a("minecraft:beetroots", h));
      a(3313, a("minecraft:beetroots", m), a("minecraft:beetroots", m));
      a(3314, a("minecraft:beetroots", x), a("minecraft:beetroots", x));
      a(3315, a("minecraft:beetroots", C), a("minecraft:beetroots", C));
   }

   private static void p() {
      a(3328, b("minecraft:grass_path"), b("minecraft:grass_path"));
      a(3344, b("minecraft:end_gateway"), b("minecraft:end_gateway"));
      a(3360, a("minecraft:repeating_command_block", aA), a("minecraft:repeating_command_block", aA));
      a(3361, a("minecraft:repeating_command_block", bY), a("minecraft:repeating_command_block", bY));
      a(3362, a("minecraft:repeating_command_block", be), a("minecraft:repeating_command_block", be));
      a(3363, a("minecraft:repeating_command_block", bB), a("minecraft:repeating_command_block", bB));
      a(3364, a("minecraft:repeating_command_block", cf), a("minecraft:repeating_command_block", cf));
      a(3365, a("minecraft:repeating_command_block", aH), a("minecraft:repeating_command_block", aH));
      a(3368, a("minecraft:repeating_command_block", aB), a("minecraft:repeating_command_block", aB));
      a(3369, a("minecraft:repeating_command_block", bZ), a("minecraft:repeating_command_block", bZ));
      a(3370, a("minecraft:repeating_command_block", bf), a("minecraft:repeating_command_block", bf));
      a(3371, a("minecraft:repeating_command_block", bC), a("minecraft:repeating_command_block", bC));
      a(3372, a("minecraft:repeating_command_block", cg), a("minecraft:repeating_command_block", cg));
      a(3373, a("minecraft:repeating_command_block", aI), a("minecraft:repeating_command_block", aI));
      a(3376, a("minecraft:chain_command_block", aA), a("minecraft:chain_command_block", aA));
      a(3377, a("minecraft:chain_command_block", bY), a("minecraft:chain_command_block", bY));
      a(3378, a("minecraft:chain_command_block", be), a("minecraft:chain_command_block", be));
      a(3379, a("minecraft:chain_command_block", bB), a("minecraft:chain_command_block", bB));
      a(3380, a("minecraft:chain_command_block", cf), a("minecraft:chain_command_block", cf));
      a(3381, a("minecraft:chain_command_block", aH), a("minecraft:chain_command_block", aH));
      a(3384, a("minecraft:chain_command_block", aB), a("minecraft:chain_command_block", aB));
      a(3385, a("minecraft:chain_command_block", bZ), a("minecraft:chain_command_block", bZ));
      a(3386, a("minecraft:chain_command_block", bf), a("minecraft:chain_command_block", bf));
      a(3387, a("minecraft:chain_command_block", bC), a("minecraft:chain_command_block", bC));
      a(3388, a("minecraft:chain_command_block", cg), a("minecraft:chain_command_block", cg));
      a(3389, a("minecraft:chain_command_block", aI), a("minecraft:chain_command_block", aI));
      a(3392, a("minecraft:frosted_ice", h), a("minecraft:frosted_ice", h));
      a(3393, a("minecraft:frosted_ice", m), a("minecraft:frosted_ice", m));
      a(3394, a("minecraft:frosted_ice", x), a("minecraft:frosted_ice", x));
      a(3395, a("minecraft:frosted_ice", C), a("minecraft:frosted_ice", C));
      a(3408, b("minecraft:magma_block"), b("minecraft:magma"));
      a(3424, b("minecraft:nether_wart_block"), b("minecraft:nether_wart_block"));
      a(3440, b("minecraft:red_nether_bricks"), b("minecraft:red_nether_brick"));
      a(3456, a("minecraft:bone_block", K), a("minecraft:bone_block", K));
      a(3460, a("minecraft:bone_block", J), a("minecraft:bone_block", J));
      a(3464, a("minecraft:bone_block", L), a("minecraft:bone_block", L));
      a(3472, b("minecraft:structure_void"), b("minecraft:structure_void"));
      a(3488, a("minecraft:observer", aE), a("minecraft:observer", aE));
      a(3489, a("minecraft:observer", cc), a("minecraft:observer", cc));
      a(3490, a("minecraft:observer", by), a("minecraft:observer", by));
      a(3491, a("minecraft:observer", bV), a("minecraft:observer", bV));
      a(3492, a("minecraft:observer", cz), a("minecraft:observer", cz));
      a(3493, a("minecraft:observer", bb), a("minecraft:observer", bb));
      a(3496, a("minecraft:observer", aF), a("minecraft:observer", aF));
      a(3497, a("minecraft:observer", cd), a("minecraft:observer", cd));
      a(3498, a("minecraft:observer", bz), a("minecraft:observer", bz));
      a(3499, a("minecraft:observer", bW), a("minecraft:observer", bW));
      a(3500, a("minecraft:observer", cA), a("minecraft:observer", cA));
      a(3501, a("minecraft:observer", bc), a("minecraft:observer", bc));
      a(3504, a("minecraft:white_shulker_box", az), a("minecraft:white_shulker_box", az));
      a(3505, a("minecraft:white_shulker_box", bX), a("minecraft:white_shulker_box", bX));
      a(3506, a("minecraft:white_shulker_box", bd), a("minecraft:white_shulker_box", bd));
      a(3507, a("minecraft:white_shulker_box", bA), a("minecraft:white_shulker_box", bA));
      a(3508, a("minecraft:white_shulker_box", ce), a("minecraft:white_shulker_box", ce));
      a(3509, a("minecraft:white_shulker_box", aG), a("minecraft:white_shulker_box", aG));
      a(3520, a("minecraft:orange_shulker_box", az), a("minecraft:orange_shulker_box", az));
      a(3521, a("minecraft:orange_shulker_box", bX), a("minecraft:orange_shulker_box", bX));
      a(3522, a("minecraft:orange_shulker_box", bd), a("minecraft:orange_shulker_box", bd));
      a(3523, a("minecraft:orange_shulker_box", bA), a("minecraft:orange_shulker_box", bA));
      a(3524, a("minecraft:orange_shulker_box", ce), a("minecraft:orange_shulker_box", ce));
      a(3525, a("minecraft:orange_shulker_box", aG), a("minecraft:orange_shulker_box", aG));
      a(3536, a("minecraft:magenta_shulker_box", az), a("minecraft:magenta_shulker_box", az));
      a(3537, a("minecraft:magenta_shulker_box", bX), a("minecraft:magenta_shulker_box", bX));
      a(3538, a("minecraft:magenta_shulker_box", bd), a("minecraft:magenta_shulker_box", bd));
      a(3539, a("minecraft:magenta_shulker_box", bA), a("minecraft:magenta_shulker_box", bA));
      a(3540, a("minecraft:magenta_shulker_box", ce), a("minecraft:magenta_shulker_box", ce));
      a(3541, a("minecraft:magenta_shulker_box", aG), a("minecraft:magenta_shulker_box", aG));
      a(3552, a("minecraft:light_blue_shulker_box", az), a("minecraft:light_blue_shulker_box", az));
      a(3553, a("minecraft:light_blue_shulker_box", bX), a("minecraft:light_blue_shulker_box", bX));
      a(3554, a("minecraft:light_blue_shulker_box", bd), a("minecraft:light_blue_shulker_box", bd));
      a(3555, a("minecraft:light_blue_shulker_box", bA), a("minecraft:light_blue_shulker_box", bA));
      a(3556, a("minecraft:light_blue_shulker_box", ce), a("minecraft:light_blue_shulker_box", ce));
      a(3557, a("minecraft:light_blue_shulker_box", aG), a("minecraft:light_blue_shulker_box", aG));
      a(3568, a("minecraft:yellow_shulker_box", az), a("minecraft:yellow_shulker_box", az));
      a(3569, a("minecraft:yellow_shulker_box", bX), a("minecraft:yellow_shulker_box", bX));
      a(3570, a("minecraft:yellow_shulker_box", bd), a("minecraft:yellow_shulker_box", bd));
      a(3571, a("minecraft:yellow_shulker_box", bA), a("minecraft:yellow_shulker_box", bA));
      a(3572, a("minecraft:yellow_shulker_box", ce), a("minecraft:yellow_shulker_box", ce));
      a(3573, a("minecraft:yellow_shulker_box", aG), a("minecraft:yellow_shulker_box", aG));
   }

   private static void q() {
      a(3584, a("minecraft:lime_shulker_box", az), a("minecraft:lime_shulker_box", az));
      a(3585, a("minecraft:lime_shulker_box", bX), a("minecraft:lime_shulker_box", bX));
      a(3586, a("minecraft:lime_shulker_box", bd), a("minecraft:lime_shulker_box", bd));
      a(3587, a("minecraft:lime_shulker_box", bA), a("minecraft:lime_shulker_box", bA));
      a(3588, a("minecraft:lime_shulker_box", ce), a("minecraft:lime_shulker_box", ce));
      a(3589, a("minecraft:lime_shulker_box", aG), a("minecraft:lime_shulker_box", aG));
      a(3600, a("minecraft:pink_shulker_box", az), a("minecraft:pink_shulker_box", az));
      a(3601, a("minecraft:pink_shulker_box", bX), a("minecraft:pink_shulker_box", bX));
      a(3602, a("minecraft:pink_shulker_box", bd), a("minecraft:pink_shulker_box", bd));
      a(3603, a("minecraft:pink_shulker_box", bA), a("minecraft:pink_shulker_box", bA));
      a(3604, a("minecraft:pink_shulker_box", ce), a("minecraft:pink_shulker_box", ce));
      a(3605, a("minecraft:pink_shulker_box", aG), a("minecraft:pink_shulker_box", aG));
      a(3616, a("minecraft:gray_shulker_box", az), a("minecraft:gray_shulker_box", az));
      a(3617, a("minecraft:gray_shulker_box", bX), a("minecraft:gray_shulker_box", bX));
      a(3618, a("minecraft:gray_shulker_box", bd), a("minecraft:gray_shulker_box", bd));
      a(3619, a("minecraft:gray_shulker_box", bA), a("minecraft:gray_shulker_box", bA));
      a(3620, a("minecraft:gray_shulker_box", ce), a("minecraft:gray_shulker_box", ce));
      a(3621, a("minecraft:gray_shulker_box", aG), a("minecraft:gray_shulker_box", aG));
      a(3632, a("minecraft:light_gray_shulker_box", az), a("minecraft:silver_shulker_box", az));
      a(3633, a("minecraft:light_gray_shulker_box", bX), a("minecraft:silver_shulker_box", bX));
      a(3634, a("minecraft:light_gray_shulker_box", bd), a("minecraft:silver_shulker_box", bd));
      a(3635, a("minecraft:light_gray_shulker_box", bA), a("minecraft:silver_shulker_box", bA));
      a(3636, a("minecraft:light_gray_shulker_box", ce), a("minecraft:silver_shulker_box", ce));
      a(3637, a("minecraft:light_gray_shulker_box", aG), a("minecraft:silver_shulker_box", aG));
      a(3648, a("minecraft:cyan_shulker_box", az), a("minecraft:cyan_shulker_box", az));
      a(3649, a("minecraft:cyan_shulker_box", bX), a("minecraft:cyan_shulker_box", bX));
      a(3650, a("minecraft:cyan_shulker_box", bd), a("minecraft:cyan_shulker_box", bd));
      a(3651, a("minecraft:cyan_shulker_box", bA), a("minecraft:cyan_shulker_box", bA));
      a(3652, a("minecraft:cyan_shulker_box", ce), a("minecraft:cyan_shulker_box", ce));
      a(3653, a("minecraft:cyan_shulker_box", aG), a("minecraft:cyan_shulker_box", aG));
      a(3664, a("minecraft:purple_shulker_box", az), a("minecraft:purple_shulker_box", az));
      a(3665, a("minecraft:purple_shulker_box", bX), a("minecraft:purple_shulker_box", bX));
      a(3666, a("minecraft:purple_shulker_box", bd), a("minecraft:purple_shulker_box", bd));
      a(3667, a("minecraft:purple_shulker_box", bA), a("minecraft:purple_shulker_box", bA));
      a(3668, a("minecraft:purple_shulker_box", ce), a("minecraft:purple_shulker_box", ce));
      a(3669, a("minecraft:purple_shulker_box", aG), a("minecraft:purple_shulker_box", aG));
      a(3680, a("minecraft:blue_shulker_box", az), a("minecraft:blue_shulker_box", az));
      a(3681, a("minecraft:blue_shulker_box", bX), a("minecraft:blue_shulker_box", bX));
      a(3682, a("minecraft:blue_shulker_box", bd), a("minecraft:blue_shulker_box", bd));
      a(3683, a("minecraft:blue_shulker_box", bA), a("minecraft:blue_shulker_box", bA));
      a(3684, a("minecraft:blue_shulker_box", ce), a("minecraft:blue_shulker_box", ce));
      a(3685, a("minecraft:blue_shulker_box", aG), a("minecraft:blue_shulker_box", aG));
      a(3696, a("minecraft:brown_shulker_box", az), a("minecraft:brown_shulker_box", az));
      a(3697, a("minecraft:brown_shulker_box", bX), a("minecraft:brown_shulker_box", bX));
      a(3698, a("minecraft:brown_shulker_box", bd), a("minecraft:brown_shulker_box", bd));
      a(3699, a("minecraft:brown_shulker_box", bA), a("minecraft:brown_shulker_box", bA));
      a(3700, a("minecraft:brown_shulker_box", ce), a("minecraft:brown_shulker_box", ce));
      a(3701, a("minecraft:brown_shulker_box", aG), a("minecraft:brown_shulker_box", aG));
      a(3712, a("minecraft:green_shulker_box", az), a("minecraft:green_shulker_box", az));
      a(3713, a("minecraft:green_shulker_box", bX), a("minecraft:green_shulker_box", bX));
      a(3714, a("minecraft:green_shulker_box", bd), a("minecraft:green_shulker_box", bd));
      a(3715, a("minecraft:green_shulker_box", bA), a("minecraft:green_shulker_box", bA));
      a(3716, a("minecraft:green_shulker_box", ce), a("minecraft:green_shulker_box", ce));
      a(3717, a("minecraft:green_shulker_box", aG), a("minecraft:green_shulker_box", aG));
      a(3728, a("minecraft:red_shulker_box", az), a("minecraft:red_shulker_box", az));
      a(3729, a("minecraft:red_shulker_box", bX), a("minecraft:red_shulker_box", bX));
      a(3730, a("minecraft:red_shulker_box", bd), a("minecraft:red_shulker_box", bd));
      a(3731, a("minecraft:red_shulker_box", bA), a("minecraft:red_shulker_box", bA));
      a(3732, a("minecraft:red_shulker_box", ce), a("minecraft:red_shulker_box", ce));
      a(3733, a("minecraft:red_shulker_box", aG), a("minecraft:red_shulker_box", aG));
      a(3744, a("minecraft:black_shulker_box", az), a("minecraft:black_shulker_box", az));
      a(3745, a("minecraft:black_shulker_box", bX), a("minecraft:black_shulker_box", bX));
      a(3746, a("minecraft:black_shulker_box", bd), a("minecraft:black_shulker_box", bd));
      a(3747, a("minecraft:black_shulker_box", bA), a("minecraft:black_shulker_box", bA));
      a(3748, a("minecraft:black_shulker_box", ce), a("minecraft:black_shulker_box", ce));
      a(3749, a("minecraft:black_shulker_box", aG), a("minecraft:black_shulker_box", aG));
      a(3760, a("minecraft:white_glazed_terracotta", bA), a("minecraft:white_glazed_terracotta", bA));
      a(3761, a("minecraft:white_glazed_terracotta", ce), a("minecraft:white_glazed_terracotta", ce));
      a(3762, a("minecraft:white_glazed_terracotta", bd), a("minecraft:white_glazed_terracotta", bd));
      a(3763, a("minecraft:white_glazed_terracotta", aG), a("minecraft:white_glazed_terracotta", aG));
      a(3776, a("minecraft:orange_glazed_terracotta", bA), a("minecraft:orange_glazed_terracotta", bA));
      a(3777, a("minecraft:orange_glazed_terracotta", ce), a("minecraft:orange_glazed_terracotta", ce));
      a(3778, a("minecraft:orange_glazed_terracotta", bd), a("minecraft:orange_glazed_terracotta", bd));
      a(3779, a("minecraft:orange_glazed_terracotta", aG), a("minecraft:orange_glazed_terracotta", aG));
      a(3792, a("minecraft:magenta_glazed_terracotta", bA), a("minecraft:magenta_glazed_terracotta", bA));
      a(3793, a("minecraft:magenta_glazed_terracotta", ce), a("minecraft:magenta_glazed_terracotta", ce));
      a(3794, a("minecraft:magenta_glazed_terracotta", bd), a("minecraft:magenta_glazed_terracotta", bd));
      a(3795, a("minecraft:magenta_glazed_terracotta", aG), a("minecraft:magenta_glazed_terracotta", aG));
      a(3808, a("minecraft:light_blue_glazed_terracotta", bA), a("minecraft:light_blue_glazed_terracotta", bA));
      a(3809, a("minecraft:light_blue_glazed_terracotta", ce), a("minecraft:light_blue_glazed_terracotta", ce));
      a(3810, a("minecraft:light_blue_glazed_terracotta", bd), a("minecraft:light_blue_glazed_terracotta", bd));
      a(3811, a("minecraft:light_blue_glazed_terracotta", aG), a("minecraft:light_blue_glazed_terracotta", aG));
      a(3824, a("minecraft:yellow_glazed_terracotta", bA), a("minecraft:yellow_glazed_terracotta", bA));
      a(3825, a("minecraft:yellow_glazed_terracotta", ce), a("minecraft:yellow_glazed_terracotta", ce));
      a(3826, a("minecraft:yellow_glazed_terracotta", bd), a("minecraft:yellow_glazed_terracotta", bd));
      a(3827, a("minecraft:yellow_glazed_terracotta", aG), a("minecraft:yellow_glazed_terracotta", aG));
   }

   private static void r() {
      a(3840, a("minecraft:lime_glazed_terracotta", bA), a("minecraft:lime_glazed_terracotta", bA));
      a(3841, a("minecraft:lime_glazed_terracotta", ce), a("minecraft:lime_glazed_terracotta", ce));
      a(3842, a("minecraft:lime_glazed_terracotta", bd), a("minecraft:lime_glazed_terracotta", bd));
      a(3843, a("minecraft:lime_glazed_terracotta", aG), a("minecraft:lime_glazed_terracotta", aG));
      a(3856, a("minecraft:pink_glazed_terracotta", bA), a("minecraft:pink_glazed_terracotta", bA));
      a(3857, a("minecraft:pink_glazed_terracotta", ce), a("minecraft:pink_glazed_terracotta", ce));
      a(3858, a("minecraft:pink_glazed_terracotta", bd), a("minecraft:pink_glazed_terracotta", bd));
      a(3859, a("minecraft:pink_glazed_terracotta", aG), a("minecraft:pink_glazed_terracotta", aG));
      a(3872, a("minecraft:gray_glazed_terracotta", bA), a("minecraft:gray_glazed_terracotta", bA));
      a(3873, a("minecraft:gray_glazed_terracotta", ce), a("minecraft:gray_glazed_terracotta", ce));
      a(3874, a("minecraft:gray_glazed_terracotta", bd), a("minecraft:gray_glazed_terracotta", bd));
      a(3875, a("minecraft:gray_glazed_terracotta", aG), a("minecraft:gray_glazed_terracotta", aG));
      a(3888, a("minecraft:light_gray_glazed_terracotta", bA), a("minecraft:silver_glazed_terracotta", bA));
      a(3889, a("minecraft:light_gray_glazed_terracotta", ce), a("minecraft:silver_glazed_terracotta", ce));
      a(3890, a("minecraft:light_gray_glazed_terracotta", bd), a("minecraft:silver_glazed_terracotta", bd));
      a(3891, a("minecraft:light_gray_glazed_terracotta", aG), a("minecraft:silver_glazed_terracotta", aG));
      a(3904, a("minecraft:cyan_glazed_terracotta", bA), a("minecraft:cyan_glazed_terracotta", bA));
      a(3905, a("minecraft:cyan_glazed_terracotta", ce), a("minecraft:cyan_glazed_terracotta", ce));
      a(3906, a("minecraft:cyan_glazed_terracotta", bd), a("minecraft:cyan_glazed_terracotta", bd));
      a(3907, a("minecraft:cyan_glazed_terracotta", aG), a("minecraft:cyan_glazed_terracotta", aG));
      a(3920, a("minecraft:purple_glazed_terracotta", bA), a("minecraft:purple_glazed_terracotta", bA));
      a(3921, a("minecraft:purple_glazed_terracotta", ce), a("minecraft:purple_glazed_terracotta", ce));
      a(3922, a("minecraft:purple_glazed_terracotta", bd), a("minecraft:purple_glazed_terracotta", bd));
      a(3923, a("minecraft:purple_glazed_terracotta", aG), a("minecraft:purple_glazed_terracotta", aG));
      a(3936, a("minecraft:blue_glazed_terracotta", bA), a("minecraft:blue_glazed_terracotta", bA));
      a(3937, a("minecraft:blue_glazed_terracotta", ce), a("minecraft:blue_glazed_terracotta", ce));
      a(3938, a("minecraft:blue_glazed_terracotta", bd), a("minecraft:blue_glazed_terracotta", bd));
      a(3939, a("minecraft:blue_glazed_terracotta", aG), a("minecraft:blue_glazed_terracotta", aG));
      a(3952, a("minecraft:brown_glazed_terracotta", bA), a("minecraft:brown_glazed_terracotta", bA));
      a(3953, a("minecraft:brown_glazed_terracotta", ce), a("minecraft:brown_glazed_terracotta", ce));
      a(3954, a("minecraft:brown_glazed_terracotta", bd), a("minecraft:brown_glazed_terracotta", bd));
      a(3955, a("minecraft:brown_glazed_terracotta", aG), a("minecraft:brown_glazed_terracotta", aG));
      a(3968, a("minecraft:green_glazed_terracotta", bA), a("minecraft:green_glazed_terracotta", bA));
      a(3969, a("minecraft:green_glazed_terracotta", ce), a("minecraft:green_glazed_terracotta", ce));
      a(3970, a("minecraft:green_glazed_terracotta", bd), a("minecraft:green_glazed_terracotta", bd));
      a(3971, a("minecraft:green_glazed_terracotta", aG), a("minecraft:green_glazed_terracotta", aG));
      a(3984, a("minecraft:red_glazed_terracotta", bA), a("minecraft:red_glazed_terracotta", bA));
      a(3985, a("minecraft:red_glazed_terracotta", ce), a("minecraft:red_glazed_terracotta", ce));
      a(3986, a("minecraft:red_glazed_terracotta", bd), a("minecraft:red_glazed_terracotta", bd));
      a(3987, a("minecraft:red_glazed_terracotta", aG), a("minecraft:red_glazed_terracotta", aG));
      a(4000, a("minecraft:black_glazed_terracotta", bA), a("minecraft:black_glazed_terracotta", bA));
      a(4001, a("minecraft:black_glazed_terracotta", ce), a("minecraft:black_glazed_terracotta", ce));
      a(4002, a("minecraft:black_glazed_terracotta", bd), a("minecraft:black_glazed_terracotta", bd));
      a(4003, a("minecraft:black_glazed_terracotta", aG), a("minecraft:black_glazed_terracotta", aG));
      a(4016, b("minecraft:white_concrete"), a("minecraft:concrete", ae));
      a(4017, b("minecraft:orange_concrete"), a("minecraft:concrete", Z));
      a(4018, b("minecraft:magenta_concrete"), a("minecraft:concrete", Y));
      a(4019, b("minecraft:light_blue_concrete"), a("minecraft:concrete", W));
      a(4020, b("minecraft:yellow_concrete"), a("minecraft:concrete", af));
      a(4021, b("minecraft:lime_concrete"), a("minecraft:concrete", X));
      a(4022, b("minecraft:pink_concrete"), a("minecraft:concrete", aa));
      a(4023, b("minecraft:gray_concrete"), a("minecraft:concrete", U));
      a(4024, b("minecraft:light_gray_concrete"), a("minecraft:concrete", ad));
      a(4025, b("minecraft:cyan_concrete"), a("minecraft:concrete", T));
      a(4026, b("minecraft:purple_concrete"), a("minecraft:concrete", ab));
      a(4027, b("minecraft:blue_concrete"), a("minecraft:concrete", R));
      a(4028, b("minecraft:brown_concrete"), a("minecraft:concrete", S));
      a(4029, b("minecraft:green_concrete"), a("minecraft:concrete", V));
      a(4030, b("minecraft:red_concrete"), a("minecraft:concrete", ac));
      a(4031, b("minecraft:black_concrete"), a("minecraft:concrete", Q));
      a(4032, b("minecraft:white_concrete_powder"), a("minecraft:concrete_powder", ae));
      a(4033, b("minecraft:orange_concrete_powder"), a("minecraft:concrete_powder", Z));
      a(4034, b("minecraft:magenta_concrete_powder"), a("minecraft:concrete_powder", Y));
      a(4035, b("minecraft:light_blue_concrete_powder"), a("minecraft:concrete_powder", W));
      a(4036, b("minecraft:yellow_concrete_powder"), a("minecraft:concrete_powder", af));
      a(4037, b("minecraft:lime_concrete_powder"), a("minecraft:concrete_powder", X));
      a(4038, b("minecraft:pink_concrete_powder"), a("minecraft:concrete_powder", aa));
      a(4039, b("minecraft:gray_concrete_powder"), a("minecraft:concrete_powder", U));
      a(4040, b("minecraft:light_gray_concrete_powder"), a("minecraft:concrete_powder", ad));
      a(4041, b("minecraft:cyan_concrete_powder"), a("minecraft:concrete_powder", T));
      a(4042, b("minecraft:purple_concrete_powder"), a("minecraft:concrete_powder", ab));
      a(4043, b("minecraft:blue_concrete_powder"), a("minecraft:concrete_powder", R));
      a(4044, b("minecraft:brown_concrete_powder"), a("minecraft:concrete_powder", S));
      a(4045, b("minecraft:green_concrete_powder"), a("minecraft:concrete_powder", V));
      a(4046, b("minecraft:red_concrete_powder"), a("minecraft:concrete_powder", ac));
      a(4047, b("minecraft:black_concrete_powder"), a("minecraft:concrete_powder", Q));
      a(4080, a("minecraft:structure_block", Map.of("mode", "save")), a("minecraft:structure_block", Map.of("mode", "save")));
      a(4081, a("minecraft:structure_block", Map.of("mode", "load")), a("minecraft:structure_block", Map.of("mode", "load")));
      a(4082, a("minecraft:structure_block", Map.of("mode", "corner")), a("minecraft:structure_block", Map.of("mode", "corner")));
      a(4083, a("minecraft:structure_block", Map.of("mode", "data")), a("minecraft:structure_block", Map.of("mode", "data")));
   }

   static {
      d.defaultReturnValue(-1);
      b();
      c();
      d();
      e();
      f();
      g();
      h();
      i();
      j();
      k();
      l();
      m();
      n();
      o();
      p();
      q();
      r();
      a();
   }
}
